package com.minia.dao.productd;

import com.minia.entity.Product;
import com.minia.entity.User;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
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


    public List getProducts(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Product.class);
        List products = criteria.list();

        for(Iterator it = products.iterator(); it.hasNext(); ) {

            Product pd = (Product) it.next();

        }

        return products;

    }
}
