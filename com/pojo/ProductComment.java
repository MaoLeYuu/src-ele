package com.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:13
 * @Version 1.0
 */
//商品评价的实体类
public class ProductComment implements Serializable {
    private int productCommentId;
    private int userId;
    private int productId;
    private String comment;
    private Date date;

    public ProductComment() {
    }

    public ProductComment(int productCommentId, int userId, int productId, String comment, Date date) {
        this.productCommentId = productCommentId;
        this.userId = userId;
        this.productId = productId;
        this.comment = comment;
        this.date = date;
    }

    public int getProduct_comment_id() {
        return productCommentId;
    }

    public void setProduct_comment_id(int productCommentId) {
        this.productCommentId = productCommentId;
    }

    public int getUser_id() {
        return userId;
    }

    public void setUser_id(int userId) {
        this.userId = userId;
    }

    public int getProduct_id() {
        return productId;
    }

    public void setProduct_id(int productId) {
        this.productId = productId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ProductComment{" +
                "productCommentId=" + productCommentId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
