package br.com.cod3r.builder.meal._builder.builder;

public class ComboSalada1Builder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Coca-cola");
    }

    @Override
    public void buildMain() {
        meal.setMain("Burger salada duplo");
    }

    @Override
    public void buildSide() {
        meal.setSide("Batata fritas Tam G");
    }
    
}
