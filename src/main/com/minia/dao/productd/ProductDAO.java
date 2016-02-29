package com.minia.dao.productd;

import com.minia.entity.Product;

import java.util.List;

/**
 * Created by duanyujia on 2/25/16.
 */
public interface ProductDAO {
    public int save(Product p);
    public List<Product> findAll();
    public List getProducts();
}
