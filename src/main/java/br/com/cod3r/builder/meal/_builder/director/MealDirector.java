package br.com.cod3r.builder.meal._builder.director;

import br.com.cod3r.builder.meal._builder.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal._builder.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder){
        this.builder = builder;
    }

    public void construirCombo(){
        builder.buildDrink();
        builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
    }

    public FastFoodMeal getCombo(){
        return builder.getMeal();
    }
}
