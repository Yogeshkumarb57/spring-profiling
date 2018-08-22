package com.spring.boot.profiling.entity;

import java.math.BigDecimal;

public class Order {
    private String date;
    private String id;
    private BigDecimal value;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", id='" + id + '\'' +
                ", value=" + value +
                '}';
    }

    public Order(String date, String id, BigDecimal value) {
        this.date = date;
        this.id = id;
        this.value = value;
    }

    public Order() {
    }
}
