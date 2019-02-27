package com.personal.assignment2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
@Getter
@AllArgsConstructor
public class FoodItemCatalog {
    private List<FoodItems> foodItemsList;
    private static FoodItemCatalog ourInstance  ;

    public static void initializeInstance(List<FoodItems> foodItemsList) {
        if(ourInstance==null){
            ourInstance=new FoodItemCatalog(foodItemsList);
        }
    }

    public static FoodItemCatalog getInstance() {
        return ourInstance;
    }

    private FoodItemCatalog() {
    }

    public List<FoodItems> getList(){
        return Collections.unmodifiableList(foodItemsList);
    }
}
