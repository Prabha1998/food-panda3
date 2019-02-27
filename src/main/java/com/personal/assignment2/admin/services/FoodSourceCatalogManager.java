package com.personal.assignment2.admin.services;

import com.personal.assignment2.model.FoodSource;
import com.personal.assignment2.model.FoodSourceCatalog;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FoodSourceCatalogManager {
    List<FoodSource> foodSources;
    FoodSourceCatalog foodSourceCatalog;


    void initializeDatabase(){
         FoodSourceCatalog.initializeInstance(foodSources);
         foodSourceCatalog=FoodSourceCatalog.getInstance();
    }

    void addToCatalog(FoodSource newFoodSource){
        foodSourceCatalog.getFoodSourceList().add(newFoodSource);
    }


    void deleteFromCatalog(FoodSource foodSource){
        foodSourceCatalog.getFoodSourceList().remove(foodSource);
    }
}
