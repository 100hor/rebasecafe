package com.rebaseCaffe.model;

import lombok.Data;

import java.util.Set;


@Data
public class Menu {
    private Set<Dish> dishSet;

    public Menu(Set<Dish> dishSet) {
        this.dishSet = dishSet;
    }



}
