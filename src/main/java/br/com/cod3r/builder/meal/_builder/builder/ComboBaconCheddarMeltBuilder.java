package br.com.cod3r.builder.meal._builder.builder;

public class ComboBaconCheddarMeltBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Coca-cola");
    }

    @Override
    public void buildMain() {
        meal.setMain("Burger Bacon Cheddar Melt");
    }

    @Override
    public void buildSide() {
        meal.setSide("Batata fritas com bacon e cheddar");
    }
    
}
