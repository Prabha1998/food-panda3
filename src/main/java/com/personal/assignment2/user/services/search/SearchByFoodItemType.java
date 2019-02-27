package com.personal.assignment2.user.services.search;

import com.personal.assignment2.model.FoodItemCatalog;
import com.personal.assignment2.model.FoodItems;
import com.personal.assignment2.model.FoodItemsType;

import java.util.ArrayList;
import java.util.List;

public class SearchByFoodItemType {
    List<FoodItems> searchByFoodType(FoodItemsType foodType){
        List<FoodItems> foodItemsList=new ArrayList<FoodItems>();
        FoodItemCatalog foodItemCatalog=FoodItemCatalog.getInstance();
        for(FoodItems foodItem:foodItemCatalog.getList()){
            if(foodItem.getType()==foodType){
                foodItemsList.add(foodItem);
            }
        }
        return foodItemsList;
    }
}
