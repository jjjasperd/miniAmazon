package com.minia.dao.userd;

import com.minia.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

/**
 * Created by duanyujia on 2/24/16.
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public int save(User u) {
        return (Integer) sessionFactory.getCurrentSession().save(u);
    }

    public List<User> findAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        return criteria.list();
    }

    public List findWishList(){
      Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        List users = criteria.list();
        for(Iterator it = users.iterator(); it.hasNext(); ) {
            User user = (User) it.next();
            System.out.println(user.getUid()+"     "+user.getWishlist());
        }

        return users;

    }
}
