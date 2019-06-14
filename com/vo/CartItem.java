package com.vo;

import com.pojo.Product;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 09:44
 * @Version 1.0
 */
public class CartItem {
    private Product product;
    private int subTotal;
    private int buyNum;

    public CartItem() {
    }

    public CartItem(Product product, int subTotal, int buyNum) {
        this.product = product;
        this.subTotal = subTotal;
        this.buyNum = buyNum;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }
}
