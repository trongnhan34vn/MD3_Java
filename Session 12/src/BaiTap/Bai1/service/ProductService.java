package BaiTap.Bai1.service;

import BaiTap.Bai1.comparator.Comparator;
import BaiTap.Bai1.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService implements IProductService {

    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Khoa", 2));
        productList.add(new Product(2, "Shoes", 30000));
        productList.add(new Product(3, "shirt", 500));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        boolean isExist = false;
        for (Product prod : productList) {
            if (prod.getId() == product.getId()) {
                isExist = true;
                prod.setName(product.getName());
                prod.setPrice(product.getPrice());
                break;
            }
        }
        if (!isExist) {
            productList.add(product);
        }
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    @Override
    public void detailById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                System.out.println(product);
            }
        }
    }

    @Override
    public List<Product> sort(String a) {
        List<Product> sortList = new ArrayList<>(productList);
        Comparator comparator = new Comparator(a);
        if (a.equals("asc")) {
            Collections.sort(sortList,comparator);
        }
        if (a.equals("dsc")) {
            Collections.sort(sortList,comparator);
        }
        return sortList;
    }
}
