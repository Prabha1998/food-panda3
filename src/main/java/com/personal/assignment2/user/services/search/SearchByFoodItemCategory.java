package com.personal.assignment2.user.services.search;

import com.personal.assignment2.model.FoodItemCatalog;
import com.personal.assignment2.model.FoodItemCategory;
import com.personal.assignment2.model.FoodItems;
import com.personal.assignment2.model.FoodItemsType;

import java.util.ArrayList;
import java.util.List;

public class SearchByFoodItemCategory {

    public List<FoodItems> searchByFoodItem(FoodItemCategory foodItemCategory){
                List<FoodItems> foodItemsList=new ArrayList<FoodItems>();
                FoodItemCatalog foodItemCatalog=FoodItemCatalog.getInstance();
                for(FoodItems foodItem:foodItemCatalog.getList()){
                    if(foodItem.getCategory()==foodItemCategory){
                        foodItemsList.add(foodItem);
                    }
                }
                return foodItemsList;
            }
}
