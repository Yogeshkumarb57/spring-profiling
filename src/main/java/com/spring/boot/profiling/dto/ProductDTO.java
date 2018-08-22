package com.spring.boot.profiling.dto;

import com.spring.boot.profiling.entity.Specification;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductDTO implements Serializable{

    private Integer productId;
    private String productName;
    private String productCategory;
    private Long price;
    private String manufacturingDate;
    private Specification specification;
    private String orderId;
    private String orderDate;
    private BigDecimal orderValue;

    public ProductDTO(){}

    public ProductDTO(String productName, String productCategory, Long price, String manufacturingDate, Specification specification) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        this.specification = specification;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(BigDecimal orderValue) {
        this.orderValue = orderValue;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", price=" + price +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                ", specification=" + specification +
                ", orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderValue=" + orderValue +
                '}';
    }
}
