package com.personal.assignment2.user.services.search;

import com.personal.assignment2.model.FoodItems;
import com.personal.assignment2.model.FoodSource;

import java.util.Map;

public class SearchByFoodItem {

    public Map<FoodSource,Integer> searchByFoodItem(FoodItems foodItems){

        return foodItems.getAvailList();
    }

}
