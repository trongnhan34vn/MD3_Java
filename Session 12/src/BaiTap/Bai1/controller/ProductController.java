package BaiTap.Bai1.controller;

import BaiTap.Bai1.model.Product;
import BaiTap.Bai1.service.IProductService;
import BaiTap.Bai1.service.ProductService;

import java.util.List;

public class ProductController {
    IProductService productService = new ProductService();

    public List<Product> showProduct() {
        return productService.findAll();
    }

    public void updateProduct(Product product) {
        productService.save(product);
    }

    public void createProduct(Product product) {
        productService.save(product);
    }

    public void deleteProduct(int id) {
        productService.deleteById(id);
    }

    public List<Product> sort(String order) {
        return productService.sort(order);
    }
}
