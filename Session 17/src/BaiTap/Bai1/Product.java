package BaiTap.Bai1;

import java.io.Serializable;

public class Product implements Serializable,IProduct {
    private int id;
    private String name;
    private String manufacture;
    private float price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String manufacture, float price, String description) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void inputData() {
        System.out.println("Nhập vào tên sản phẩm: ");
        name = Main.scanner.nextLine();
        System.out.println("Nhập vào hãng sản xuất: ");
        manufacture = Main.scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm: ");
        price = Float.parseFloat(Main.scanner.nextLine());
        System.out.println("Nhập vào mô tả: ");
        description = Main.scanner.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("----------------------------------------");
        System.out.println("Mã sản phẩm: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Hãng sản xuất: " + manufacture);
        System.out.println("Giá: " + price);
        System.out.println("Mô tả: " + description);
        System.out.println("----------------------------------------");
    }
}
