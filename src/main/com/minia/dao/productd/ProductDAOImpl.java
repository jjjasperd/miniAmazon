package com.minia.dao.productd;

import com.minia.entity.Product;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by duanyujia on 2/25/16.
 */
@Repository
public class ProductDAOImpl implements ProductDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public int save(Product p) {
        return (Integer) sessionFactory.getCurrentSession().save(p);
    }

    public List<Product> findAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Product.class);
        return criteria.list();
    }
}
