package com.personal.assignment2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
public class FoodItems {

    String name;
    Themes foodItemTheme;
    FoodItemsType type;
    FoodItemCategory category;
    Map<String,Integer> extraIngredientsRate;
    Map<FoodSource,Integer> availList;


}
