package br.com.cod3r.factory.apple._simpleFactory;

import br.com.cod3r.factory.apple._factory.factory.IPhoneFactory;
import br.com.cod3r.factory.apple._factory.factory.Iphone11Factory;
import br.com.cod3r.factory.apple._factory.factory.Iphone11ProFactory;
import br.com.cod3r.factory.apple._factory.factory.IphoneXFactory;
import br.com.cod3r.factory.apple._factory.factory.IphoneXSMaxFactory;
import br.com.cod3r.factory.apple._factory.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		// Criação de cada factory dos iphone
		IPhoneFactory factoryIphone11 = new Iphone11Factory();
		IPhoneFactory factoryIphone11Pro = new Iphone11ProFactory();
		IPhoneFactory factoryIphoneX = new IphoneXFactory();
		IPhoneFactory factoryIphoneXSMax = new IphoneXSMaxFactory();
		
		System.out.println("### Ordering an iPhone 11");
		IPhone iphone11 = factoryIphone11.orderIPhone();
		System.out.println(iphone11);

		System.out.println("### Ordering an iPhone 11 Pro");
		IPhone iphone11Pro = factoryIphone11Pro.orderIPhone();
		System.out.println(iphone11Pro);

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = factoryIphoneX.orderIPhone();
		System.out.println(iphoneX);

		System.out.println("### Ordering an iPhone XS Max");
		IPhone iphoneXSMax = factoryIphoneXSMax.orderIPhone();
		System.out.println(iphoneXSMax);
	}
}
