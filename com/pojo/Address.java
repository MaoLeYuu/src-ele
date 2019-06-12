package com.pojo;

import java.io.Serializable;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 16:59
 * @Version 1.0
 */
//地址的实体类
public class Address implements Serializable {
    private int addressId;
    private int userId;
    private String address;
    private String name;
    private String gender;
    private String telephone;

    //private String detailsAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

   /* public String getDetailsAddress() {
        return detailsAddress;
    }

    public void setDetailsAddress(String detailsAddress) {
        this.detailsAddress = detailsAddress;
    }*/

    public Address() {
    }

    public Address(int addressId, int userId, String address) {
        this.addressId = addressId;
        this.userId = userId;
        this.address = address;
    }

    public int getAddress_id() {
        return addressId;
    }

    public void setAddress_id(int addressId) {
        this.addressId = addressId;
    }

    public int getUser_id() {
        return userId;
    }

    public void setUser_id(int userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", address='" + address + '\'' +
                '}';
    }
}
