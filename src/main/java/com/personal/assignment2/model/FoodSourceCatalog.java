package com.personal.assignment2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
@AllArgsConstructor
@Getter
public class FoodSourceCatalog {
    private List<FoodSource> foodSourceList;
    private static FoodSourceCatalog ourInstance ;

    public static void initializeInstance(List<FoodSource> foodSourceList) {
        if(ourInstance==null){
            ourInstance=new FoodSourceCatalog(foodSourceList);
        }
    }

    public static FoodSourceCatalog getInstance() {
        return ourInstance;
    }

    private FoodSourceCatalog() {
    }

    public List<FoodSource> getList(){
        return Collections.unmodifiableList(foodSourceList);
    }

}
