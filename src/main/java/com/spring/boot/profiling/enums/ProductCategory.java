package com.spring.boot.profiling.enums;

public enum ProductCategory {

    ELECTRONICS("ELECTRONICS"), FASHION("FASHION"), STATIONARY("STATIONARY");

    private String category;

    private ProductCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
