package com.minia.dao.userd;

import com.minia.entity.User;

import java.util.List;

/**
 * Created by duanyujia on 2/24/16.
 */
public interface UserDAO {
    public int save(User u);
    public List<User> findAll();
}
