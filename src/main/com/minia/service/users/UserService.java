package com.minia.service.users;

import com.minia.entity.User;

import java.util.List;

/**
 * Created by duanyujia on 2/24/16.
 */
public interface UserService {
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();
    public List getWishList();
}
