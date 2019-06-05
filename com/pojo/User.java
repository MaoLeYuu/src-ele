package com.pojo;

import java.io.Serializable;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:21
 * @Version 1.0
 */
//用户的实体类
public class User implements Serializable {
    private int userId;
    private String userName;
    private String userPassword;
    private String userTelephone;
    //用户是否是会员的标志
    private int userIsSuper;
    //标记用户是否使用默认地址
    private int userDefaultAddress;

    public User() {
    }

    public User(int userId, String userName, String userPassword, String userTelephone, int userIsSuper, int userDefaultAddress) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userTelephone = userTelephone;
        this.userIsSuper = userIsSuper;
        this.userDefaultAddress = userDefaultAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public int getUserIsSuper() {
        return userIsSuper;
    }

    public void setUserIsSuper(int userIsSuper) {
        this.userIsSuper = userIsSuper;
    }

    public int getUserDefaultAddress() {
        return userDefaultAddress;
    }

    public void setUserDefaultAddress(int userDefaultAddress) {
        this.userDefaultAddress = userDefaultAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userTelephone='" + userTelephone + '\'' +
                ", userIsSuper=" + userIsSuper +
                ", userDefaultAddress=" + userDefaultAddress +
                '}';
    }
}
