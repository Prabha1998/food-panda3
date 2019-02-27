package com.personal.assignment2.admin.services;

import com.personal.assignment2.model.FoodItemCatalog;
import com.personal.assignment2.model.FoodItems;
import com.personal.assignment2.model.FoodSource;
import com.personal.assignment2.model.FoodSourceCatalog;

import java.util.List;

public class FoodItemCatalogManager {
    List<FoodItems> foodItems;
    FoodItemCatalog foodItemsCatalog;



    void initializeDatabase(){
        FoodItemCatalog.initializeInstance(foodItems);
        foodItemsCatalog=FoodItemCatalog.getInstance();
    }

    void addToCatalog(FoodItems newFoodItem){
        foodItemsCatalog.getFoodItemsList().add(newFoodItem);
    }


    void deleteFromCatalog(FoodItems foodItem){
        foodItemsCatalog.getFoodItemsList().remove(foodItem);
    }

}
