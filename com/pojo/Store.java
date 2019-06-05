package com.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:15
 * @Version 1.0
 */
//店铺的实体类
public class Store implements Serializable {
    private int storeId;
    private String storeName;
    private String storeDesc;
    private String storeAddress;
    private String storeTelephone;
    private int categoryId;     //店铺分类的id号
    private String storeImage;   //店铺的标志
    private Date storeStartTime;
    private Date storeEndtime;
    public Store() {
    }

    public Store(int storeId, String storeName, String storeDesc, String storeAddress, String storeTelephone, int categoryId, String storeImage) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeDesc = storeDesc;
        this.storeAddress = storeAddress;
        this.storeTelephone = storeTelephone;
        this.categoryId = categoryId;
        this.storeImage = storeImage;
    }

    public int getstoreId() {
        return storeId;
    }

    public void setstoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getstoreName() {
        return storeName;
    }

    public void setstoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getstoreDesc() {
        return storeDesc;
    }

    public void setstoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
    }

    public String getstoreAddress() {
        return storeAddress;
    }

    public void setstoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getstoreTelephone() {
        return storeTelephone;
    }

    public void setstoreTelephone(String storeTelephone) {
        this.storeTelephone = storeTelephone;
    }

    public int getcategoryId() {
        return categoryId;
    }

    public void setcategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getStoreImage() {
        return storeImage;
    }

    public void setStoreImage(String store_image) {
        this.storeImage = store_image;
    }

    public Date getStoreStartTime() {
        return storeStartTime;
    }

    public void setStoreStartTime(Date storeStartTime) {
        this.storeStartTime = storeStartTime;
    }

    public Date getStoreEndtime() {
        return storeEndtime;
    }

    public void setStoreEndtime(Date storeEndtime) {
        this.storeEndtime = storeEndtime;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeDesc='" + storeDesc + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeTelephone='" + storeTelephone + '\'' +
                ", categoryId=" + categoryId +
                ", store_image='" + storeImage + '\'' +
                '}';
    }
}
