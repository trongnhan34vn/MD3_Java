package BaiTap.Bai1.view;

import BaiTap.Bai1.config.Config;
import BaiTap.Bai1.controller.ProductController;
import BaiTap.Bai1.model.Product;

import java.util.List;

public class ProductView {

    ProductController productController = new ProductController();
    List<Product> listProducts = productController.showProduct();

    public void showProduct() {
        System.out.println("---Id---Name---Price---");
        for (Product product : listProducts) {
            System.out.println("   " + product.getId() + "   " + product.getName() + "   " + product.getPrice());
        }
    }

    public void updateProduct() {
        while (true) {
            showProduct();
            System.out.println("Nhập vào id bạn muốn sửa");
            int idUpdate = Config.scanner.nextInt();
            if (findById(idUpdate)) {
                Config.scanner.nextLine();
                System.out.println("Nhập vào tên sản phẩm mới: ");
                String name = Config.scanner.nextLine();
                System.out.println("Nhập vào giá sản phẩm: ");
                int price = Integer.parseInt(Config.scanner.nextLine());
                Product updateProduct = new Product(idUpdate, name, price);
                productController.updateProduct(updateProduct);
                System.out.println("Update sản phẩm thành công!");
                return;
            } else {
                System.out.println("Không tìm thấy Id sản phẩm! Vui lòng nhập lại!");
            }
        }
    }

    public void sort() {
        while (true) {
            System.out.println("6. Sort By Price \n" +
                    "a. Tăng dần \n" +
                    "b. Giảm dần");
            String input = Config.scanner.nextLine();
            System.out.println("---ID---Name---Price---");
            if (input.equals("a")) {
                List<Product> sortList = productController.sort("asc");
                for (Product pd : sortList) {
                    System.out.println("   " + pd.getId() + "   " + pd.getName() + "   " + pd.getPrice());
                }
                return;
            }
            if (input.equals("b")) {
                List<Product> sortList = productController.sort("dsc");
                for (Product pd : sortList) {
                    System.out.println("   " + pd.getId() + "   " + pd.getName() + "   " + pd.getPrice());
                }
                return;
            }
        }
    }

    public void searchProduct() {
        while (true) {
            showProduct();
            System.out.println("Nhập vào tên sản phẩm bạn muốn tìm kiếm: ");
            String searchData = Config.scanner.nextLine();
            boolean isExist = false;
            for (Product prd : listProducts) {
                if (prd.getName().equalsIgnoreCase(searchData)) {
                    isExist = true;
                    System.out.println(prd);;
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy!");
            } else {
                return;
            }
        }
    }

    public boolean findById(int id) {
        for (Product product : listProducts) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void createProduct() {
        int id;
        if (listProducts.isEmpty()) {
            id = 1;
        } else {
            id = listProducts.get(listProducts.size() - 1).getId() + 1;
        }
        System.out.println("Nhập vào tên sản phẩm mới: ");
        String name = Config.scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm mới: ");
        int price = Integer.parseInt(Config.scanner.nextLine());
        Product newProduct = new Product(id, name, price);
        productController.createProduct(newProduct);
        System.out.println("Thêm mới sản phẩm thành công!");
    }

    public void deleteProduct() {
        while (true) {
            showProduct();
            System.out.println("Nhập vào Id bạn muốn xoá: ");
            int idDel = Integer.parseInt(Config.scanner.nextLine());
            if (findById(idDel)) {
                productController.deleteProduct(idDel);
                System.out.println("Xoá sản phẩm thành công!");
                return;
            } else {
                System.out.println("Không tìm thấy Id sản phẩm! Vui lòng nhập lại!");
            }
        }
    }

    public void showMenu() {
        while (true) {
            System.out.println("Enter back to comeback menu!");
            String quit = Config.scanner.nextLine();
            if (quit.equals("back")) {
                return;
            }
        }
    }
}
