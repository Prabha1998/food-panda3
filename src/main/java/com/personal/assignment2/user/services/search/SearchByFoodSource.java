package com.personal.assignment2.user.services.search;

import com.personal.assignment2.model.FoodItems;
import com.personal.assignment2.model.FoodSource;
import com.personal.assignment2.model.Themes;

import java.util.Map;
public class SearchByFoodSource {


   public Map<Themes,Map<FoodItems,Integer>> searchBy(FoodSource foodSource){
      return foodSource.getMenuCard();
   }
}
