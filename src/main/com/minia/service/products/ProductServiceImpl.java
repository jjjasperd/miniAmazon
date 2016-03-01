package com.minia.service.products;

import com.minia.dao.productd.ProductDAO;
import com.minia.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by duanyujia on 2/25/16.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    public void saveProducts(List<Product>ps) {
        for(Product p : ps){
            productDAO.save(p);
        }
    }

    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }
}
