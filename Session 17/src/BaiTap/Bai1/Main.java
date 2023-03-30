package BaiTap.Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Product> listProducts = readFile("src/BaiTap/Bai1/productFile.txt");
        while (true) {
            System.out.println("--------------------- Menu ---------------------");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm thông tin sản phẩm");
            System.out.println("4. Xoá sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("------------------------------------------------");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createProduct(listProducts);
                    break;
                case 2:
                    displayProduct(listProducts);
                    break;
                case 3:
                    searchProduct(listProducts);
                    break;
                case 4:
                    deleteProduct(listProducts);
                    break;
                case 5:
                    writeFile("src/BaiTap/Bai1/productFile.txt", listProducts);
                    System.exit(0);
                    break;
            }
        }
    }

    public static void createProduct(List<Product> listProducts) {
        System.out.println("Nhập vào số sản phẩm thêm mới: ");
        int mountProducts = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < mountProducts; i++) {
            System.out.println("Nhập vào sản phẩm thứ " + (i + 1));
            Product newProduct = new Product();
            if (listProducts.isEmpty()) {
                newProduct.setId(1);
            } else {
                newProduct.setId(listProducts.get(listProducts.size() - 1).getId() + 1);
            }
            newProduct.inputData();
            listProducts.add(newProduct);
        }
        System.out.println("Thêm mới thành công " + mountProducts + " sản phẩm");
    }

    public static void searchProduct(List<Product> listProducts) {
        System.out.println("Nhập vào id sản phẩm cần tìm: ");
        int searchId = Integer.parseInt(scanner.nextLine());
        Product searchPro = findById(searchId, listProducts);
        searchPro.displayData();
    }

    public static void deleteProduct(List<Product> listProducts) {
        System.out.println("Nhập vào id sản phẩm cần tìm: ");
        int searchId = Integer.parseInt(scanner.nextLine());
        Product searchPro = findById(searchId, listProducts);
        listProducts.remove(searchPro);
        System.out.println("Xoá sản phẩm thành công!");
    }

    public static Product findById(int id ,List<Product> listProducts) {
        for (Product product: listProducts) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public static void displayProduct(List<Product> listProducts) {
        System.out.println("Danh sách sản phẩm: ");
        for (Product product:listProducts) {
            product.displayData();
        }
    }

    public static List<Product> readFile(String path) {
        List<Product> list = new ArrayList<>();
        File file = new File(path);
        if(!file.exists()) {
            return new ArrayList<>();
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis);
            list = (List<Product>) oos.readObject();
            fis.close();
            oos.close();
        } catch (IOException | ClassNotFoundException e) {

        }
        return list;
    }

    public static void writeFile(String path, List<Product> list) {
        File file = new File(path);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
