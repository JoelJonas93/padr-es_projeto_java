package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Executando Abstract Factory");

		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory factoryIphone11 = new IPhone11Factory(rules);
		IPhoneFactory factoryIphoneX = new IPhoneXFactory(rules);

		System.out.println("Iphone 11");
		IPhone iphone11 = factoryIphone11.orderIPhone("standard");
		System.out.println(iphone11);

		System.out.println("Iphone 11 Pro");
		IPhone iphone11Pro = factoryIphone11.orderIPhone("pro");
		System.out.println(iphone11Pro);

		System.out.println("Iphone X");
		IPhone iphoneX = factoryIphoneX.orderIPhone("standard");
		System.out.println(iphoneX);

		System.out.println("Iphone X S Max");
		IPhone iphoneXSMax = factoryIphoneX.orderIPhone("SMAX");
		System.out.println(iphoneXSMax);

	}
}
