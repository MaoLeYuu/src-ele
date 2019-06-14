package com.controller.result;

import java.io.Serializable;
import java.util.Date;

public class ProductOne implements Serializable {
    private int id;
    private String productName;
    private String date;
    private String userName;
    private String pComment;
    private double ComMark;

    public String getpComment() {
        return pComment;
    }

    public void setpComment(String pComment) {
        this.pComment = pComment;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getComMark() {
        return ComMark;
    }

    public void setComMark(double comMark) {
        ComMark = comMark;
    }
}
