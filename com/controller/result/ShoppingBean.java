package com.controller.result;


import java.util.Objects;

//记录每一种商品的售出
public class ShoppingBean {
    private String productName;
    private Integer count = 0;
    private Double total;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingBean that = (ShoppingBean) o;
        return productName.equals(that.productName) &&
                count.equals(that.count) &&
                total.equals(that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, count, total);
    }
}
