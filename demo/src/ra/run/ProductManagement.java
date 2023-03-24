package ra.run;

import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;
import ra.bussinessImp.Product;
import ra.config.Config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManagement {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sản phẩm và nhập thông tin sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "3. Sắp xếp sản phẩm theo lợi nhuận tăng dần\n" +
                    "4. Xóa sản phẩm theo mã sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên sản phẩm\n" +
                    "6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm\n" +
                    "7. Thoát \n");

            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(Config.scanner.nextLine());
            switch (choice) {
                case 1:
//                    Tạo mới nhiều sản phẩm
                    createBooks(listProducts);
                    break;
                case 2:
//                    Hiển thị danh sách sản phẩm
                    displayProduct(listProducts);
                    break;
                case 3:
//                    Sắp xếp theo lợi nhuận
                    sort(listProducts);
                    break;
                case 4:
//                    Xoá sản phẩm theo id
                    deleteId(listProducts);
                    break;
                case 5:
//                    Tìm kiếm sản phẩm theo tên
                    searchByName(listProducts);
                    break;
                case 6:
//                    Thay đổi trạng thái sản phẩm thông qua id
                    changeStatus(listProducts);
                    break;
                case 7:
                    System.out.println("Dễ!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public static void createBooks(List<Product> list) {
        System.out.println("Nhập vào số lượng sản phẩm muốn thêm mới");
        int count = Integer.parseInt(Config.scanner.nextLine());
        for (int i = 0; i < count; i++) {
            Product newProduct = new Product();
            System.out.println("Nhập vào thông tin sản phẩm thứ " + (i + 1));
            if (list.isEmpty()) {
                newProduct.setProductId(1);
            } else {
                newProduct.setProductId(list.get(list.size() - 1).getProductId() + 1);
            }
            newProduct.inputData();
            list.add(newProduct);
        }
        System.out.println("Thêm mới thành công!");
        displayProduct(list);
    }

    public static void displayProduct(List<Product> list) {
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : list) {
            System.out.println("----------------------------------------------");
            System.out.println("Id sản phẩm: " + product.getProductId());
            System.out.println("Tên sản phẩm: " + product.getProductName());
            System.out.println("Title: " + product.getTitle());
            System.out.println("Description: " + product.getDescriptions());
            System.out.println("Price: " + product.getExportPrice());
            System.out.println("Trạng thái sản phẩm: " + (product.isProductStatus() ? "còn hàng" : "hết hàng"));
            System.out.println("----------------------------------------------");
        }
    }

    public static void sort(List<Product> list) {
        Collections.sort(list);
    }

    public static void deleteId(List<Product> list) {
        while (true) {
            displayProduct(list);
            System.out.println("Nhập vào Id sản phẩm muốn xoá: ");
            int delId = Integer.parseInt(Config.scanner.nextLine());
            Product delProduct = findById(delId, list);
            if (delProduct != null) {
                list.remove(delProduct);
                System.out.println("Xoá sản phẩm thành công!");
                return;
            } else {
                System.out.println("Không tìm thấy id! Nhập lại đi");
            }
        }
    }

    public static void searchByName(List<Product> list) {
        System.out.println("Nhập vào tên sản phẩm cần tìm kiếm: ");
        List<Product> searchArr = new ArrayList<>(list);
        String search = Config.scanner.nextLine();
        boolean isExist = false;
        for (Product product: list) {
            if (product.getProductName().equals(search)) {
                isExist = true;
            }
        }
        if (isExist) {
            searchArr.removeIf(prd -> !prd.getProductName().contains(search));
            displayProduct(searchArr);
        } else {
            System.out.println("Không tìm thấy!");
        }
    }

    public static void changeStatus(List<Product> list) {
        while (true) {
            displayProduct(list);
            System.out.println("Nhập vào mã sản phẩm muốn sửa: ");
            int changeId = Integer.parseInt(Config.scanner.nextLine());
            Product updateProduct = findById(changeId, list);
            if (updateProduct != null) {
                System.out.println("Trước khi update: ");
                updateProduct.displayData();
                updateProduct.setProductStatus(!updateProduct.isProductStatus());
                System.out.println("Sau khi update: ");
                updateProduct.displayData();
                return;
            } else {
                System.out.println("Không tìm thấy id sản phẩm!");
            }
        }
    }

    public static Product findById(int id, List<Product> list) {
        for (Product product : list) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }
}
