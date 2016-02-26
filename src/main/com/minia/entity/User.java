package com.minia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by duanyujia on 2/24/16.
 */
@Entity
@Table
public class User implements Serializable {
    @Id
    @GeneratedValue
    private int uid;

    private String username;

    private String userPassword;

    private String userEmail;

    //private List<Product> wishlistp;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
/*
    public List<Product> getWishlistp() {
        return wishlistp;
    }
*/
    /*
    public void setWishlistp(List<Product> wishlistp) {
        this.wishlistp = wishlistp;
    }
    */
}
