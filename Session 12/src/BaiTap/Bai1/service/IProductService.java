package BaiTap.Bai1.service;

import BaiTap.Bai1.model.Product;

import java.util.List;

public interface IProductService {
    //    show product: nhưng dưới tên findAll. in ra toàn bộ sản phẩm;
    List<Product> findAll();

    //    thêm mới sản phẩm
    void save(Product product);

    Product findById(int id);

    void deleteById(int id);

    void detailById(int id);

    List<Product> sort(String a);
}
