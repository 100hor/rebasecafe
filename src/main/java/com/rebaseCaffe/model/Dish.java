package com.rebaseCaffe.model;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class Dish {
    private final String title;
    private final String description;
    private final BigDecimal price;

    public Dish(String title, String description, String price) {
        this.title = title;
        this.description = description;
        this.price = new BigDecimal(price);
    }

    @Override
    public String toString() {
        return title + ',' + description + ',' + price.toString() + "\n";
    }




}
