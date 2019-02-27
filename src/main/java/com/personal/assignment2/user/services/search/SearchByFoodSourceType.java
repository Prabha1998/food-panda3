package com.personal.assignment2.user.services.search;

import com.personal.assignment2.model.FoodSource;
import com.personal.assignment2.model.FoodSourceCatalog;
import com.personal.assignment2.model.FoodSourceType;

import java.util.ArrayList;
import java.util.List;

public class SearchByFoodSourceType {

    List<FoodSource> searchByFoodSourceType(FoodSourceType foodSourceType){
        List<FoodSource> foodSourceList=new ArrayList<FoodSource>();
        FoodSourceCatalog foodSourceCatalog=FoodSourceCatalog.getInstance();
        for(FoodSource foodSource:foodSourceCatalog.getList()){
            if(foodSource.getType()==foodSourceType){
                foodSourceList.add(foodSource);
            }
        }
        return foodSourceList;
    }

}
