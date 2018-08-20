package com.spring.boot.profiling.entity;

import com.spring.boot.profiling.enums.ProductCategory;

import java.util.Date;

public class Product {

    private Integer id;
    private String name;
    private ProductCategory productCategory;
    private Long price;
    private Date manufacturingDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productCategory=" + productCategory +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }

    public Product() {
    }

    public Product(String name, ProductCategory productCategory, Long price, Date manufacturingDate) {
        this.name = name;
        this.productCategory = productCategory;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }


}
