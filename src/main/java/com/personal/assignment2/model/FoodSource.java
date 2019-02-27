package com.personal.assignment2.model;

import lombok.Getter;

import java.util.Map;
@Getter
public class FoodSource {

    String name;
    FoodSourceType type;
    Map< Themes,Map<FoodItems,Integer>> menuCard;

}
