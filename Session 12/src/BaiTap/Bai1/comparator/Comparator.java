package BaiTap.Bai1.comparator;

import BaiTap.Bai1.model.Product;
import BaiTap.Bai1.service.ProductService;

public class Comparator implements java.util.Comparator<Product> {

    String order;

    public Comparator(String order) {
        this.order = order;
    }

    public Comparator() {
    }

    @Override
    public int compare(Product p1, Product p2) {
        if (order.equals("asc")) {
            if (p1.getPrice() - p2.getPrice() < 0) {
                return -1;
            } else if (p1.getPrice() - p2.getPrice() > 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (p1.getPrice() - p2.getPrice() > 0) {
                return -1;
            } else if (p1.getPrice() - p2.getPrice() < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
