package com.personal.assignment2.user.services.search;

import com.personal.assignment2.model.FoodItems;
import com.personal.assignment2.model.FoodSource;
import com.personal.assignment2.model.Themes;

import java.util.List;
import java.util.Map;

public class SearchByTheme  {
    public List<FoodItems> searchBy(Themes foodSourceTheme){
       return foodSourceTheme.getFoodItemsList();
    }
}
