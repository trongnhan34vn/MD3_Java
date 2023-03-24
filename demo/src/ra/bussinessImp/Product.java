package ra.bussinessImp;

import ra.bussiness.IProduct;
import ra.config.Config;

import java.util.Comparator;

public class Product implements IProduct, Comparable<Product> {
    int productId;
    String productName;
    String title;
    String descriptions;
    float importPrice;
    float exportPrice;
    float interest;
    boolean productStatus;

    public Product(int productId, String productName, String title, String descriptions, float importPrice, float exportPrice, float interest, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", productStatus=" + productStatus +
                '}';
    }

    @Override
    public void inputData() {
        System.out.println("Nhập vào tên sản phẩm: ");
        productName = Config.scanner.nextLine();
        System.out.println("Nhập vào title sản phẩm: ");
        title = Config.scanner.nextLine();
        System.out.println("Nhập vào description sản phẩm: ");
        descriptions = Config.scanner.nextLine();
        System.out.println("Nhập vào import price");
        importPrice = Float.parseFloat(Config.scanner.nextLine()) ;
        System.out.println("Nhập vào export price");
        exportPrice = Float.parseFloat(Config.scanner.nextLine());
        System.out.println("Còn hàng không?");
        productStatus = Boolean.parseBoolean(Config.scanner.nextLine()) ;
        interest = exportPrice - importPrice;
    }

    @Override
    public void displayData() {
        System.out.println("----------------------------------------------");
        System.out.println("Id sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Title: " + title);
        System.out.println("Description: " + descriptions);
        System.out.println("Price: " + exportPrice);
        System.out.println("Trạng thái sản phẩm: " + (productStatus ? "còn hàng" : "hết hàng"));
        System.out.println("----------------------------------------------");
    }

    @Override
    public int compareTo(Product o) {
        return (int) (interest - o.interest);
    }
}
