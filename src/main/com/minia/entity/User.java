package com.minia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

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

    private String wishList;



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


    public String getWishlist() {
        return wishList;
    }


    public void setWishlist(String wishList) {
        this.wishList = wishList;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", wishList='" + wishList + '\'' +
                '}';
    }
}
