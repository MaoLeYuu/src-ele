package com.controller.result;

import com.pojo.Product;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class productCommentBean implements Serializable {
    private double storeCom;
    private String userName;
    private Date date;
    private List<One> productOnes;

    public productCommentBean() {
    }

    /*//public productCommentBean(double storeCom, String userName, Date date, List<ProductOne> productOnes) {
        this.storeCom = storeCom;
        this.userName = userName;
        this.date = date;
        this.productOnes = productOnes;
    }*/

    public double getStoreCom() {
        return storeCom;
    }

    public void setStoreCom(double storeCom) {
        this.storeCom = storeCom;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<One> getProductOnes() {
        return productOnes;
    }

    public void setProductOnes(List<One> productOnes) {
        this.productOnes = productOnes;
    }

    @Override
    public String toString() {
        return "productCommentBean{" +
                "storeCom=" + storeCom +
                ", userName='" + userName + '\'' +
                ", date=" + date +
                ", productOnes=" + productOnes +
                '}';
    }
}
