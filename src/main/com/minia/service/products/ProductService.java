package com.minia.service.products;

import com.minia.entity.Product;

import java.util.List;

/**
 * Created by duanyujia on 2/25/16.
 */
public interface ProductService {
    public void saveProducts(List<Product> ps);
    public List<Product> getAllProducts();
}
