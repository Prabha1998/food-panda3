package com.personal.assignment2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
@Getter
public class Themes {
    String name;
    List<FoodItems> foodItemsList;
}
