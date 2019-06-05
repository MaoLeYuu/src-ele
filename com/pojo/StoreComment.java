package com.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:19
 * @Version 1.0
 */
//店铺评价的实体类
public class StoreComment implements Serializable {
    private int storeCommentId;
    private int userId;
    private int storeId;
    private String comment;
    private Date date;

    public StoreComment() {
    }

    public StoreComment(int storeCommentId, int userId, int storeId, String comment, Date date) {
        this.storeCommentId = storeCommentId;
        this.userId = userId;
        this.storeId = storeId;
        this.comment = comment;
        this.date = date;
    }

    public int getstoreCommentId() {
        return storeCommentId;
    }

    public void setstoreCommentId(int storeCommentId) {
        this.storeCommentId = storeCommentId;
    }

    public int getuserId() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }

    public int getstoreId() {
        return storeId;
    }

    public void setstoreId(int storeId) {
        this.storeId = storeId;
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
        return "Store_comment{" +
                "storeCommentId=" + storeCommentId +
                ", userId=" + userId +
                ", storeId=" + storeId +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
