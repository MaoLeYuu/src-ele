package com.pojo;

import java.io.Serializable;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:10
 * @Version 1.0
 */
//商品的实体类
public class Product implements Serializable {
    private int productId;
    private String productName;
    private double productPrice;
    //商品的简介
    private String productDesc;
    private int productCount;
    private int storeId;
    //商品的标志
    private String productImage;

    public Product() {
    }

    public Product(int productId, String productName, double productPrice, String productDesc, int productCount, int storeId, String productImage) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.productCount = productCount;
        this.storeId = storeId;
        this.productImage = productImage;
    }

    public int getProduct_id() {
        return productId;
    }

    public void setProduct_id(int productId) {
        this.productId = productId;
    }

    public String getProduct_name() {
        return productName;
    }

    public void setProduct_name(String productName) {
        this.productName = productName;
    }

    public double getProduct_price() {
        return productPrice;
    }

    public void setProduct_price(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProduct_desc() {
        return productDesc;
    }

    public void setProduct_desc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getProduct_count() {
        return productCount;
    }

    public void setProduct_count(int productCount) {
        this.productCount = productCount;
    }

    public int getStore_id() {
        return storeId;
    }

    public void setStore_id(int storeId) {
        this.storeId = storeId;
    }

    public String getProduct_image() {
        return productImage;
    }

    public void setProduct_image(String productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", productCount=" + productCount +
                ", storeId=" + storeId +
                ", productImage='" + productImage + '\'' +
                '}';
    }
}
