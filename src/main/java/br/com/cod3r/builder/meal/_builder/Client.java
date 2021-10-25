package br.com.cod3r.builder.meal._builder;

import br.com.cod3r.builder.meal._builder.builder.ComboBaconCheddarMeltBuilder;
import br.com.cod3r.builder.meal._builder.builder.ComboSalada1Builder;
import br.com.cod3r.builder.meal._builder.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal._builder.director.MealDirector;

public class Client {

	public static void order(FastFoodMealBuilder builder){
		System.out.println("Ordering");
		MealDirector director = new MealDirector(builder);
		director.construirCombo();
		System.out.println(director.getCombo());
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		order(new ComboBaconCheddarMeltBuilder());
		order(new ComboSalada1Builder());
	}
}