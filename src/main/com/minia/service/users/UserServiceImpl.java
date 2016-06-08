package com.minia.service.users;

import com.minia.dao.userd.UserDAO;
import com.minia.entity.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by duanyujia on 2/24/16.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDao;
    private static Logger logger = Logger.getLogger(UserServiceImpl.class);
    public void saveUsers(List<User> us) {
        for (User u : us){
            userDao.save(u);
        }
    }

    public List<User> getAllUsernames() {
        return userDao.findAll();
    }

    public List getWishList(){return userDao.findWishList();}

    public void updateWL(int userid,String pid){
        userDao.updateWL(userid,pid);
    }


}
