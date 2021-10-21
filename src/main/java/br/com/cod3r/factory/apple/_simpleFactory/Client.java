package br.com.cod3r.factory.apple._simpleFactory;

import br.com.cod3r.factory.apple._simpleFactory.model.IPhone;
import br.com.cod3r.factory.apple._simpleFactory.simpleFactory.IPhoneSimpleFactory;

public class Client {
	
	public static void main(String[] args) {

		System.out.println("### Using SimpleFactory");

		// Criação de cada factory dos iphone
		IPhoneSimpleFactory factoryIphone = new IPhoneSimpleFactory();
		
		System.out.println("### Ordering an iPhone 11");
		IPhone iphone11 = factoryIphone.orderIPhone("11","standard");
		System.out.println(iphone11);

		System.out.println("### Ordering an iPhone 11 Pro");
		IPhone iphone11Pro = factoryIphone.orderIPhone("11","pro");
		System.out.println(iphone11Pro);

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = factoryIphone.orderIPhone("X","standard");
		System.out.println(iphoneX);

		System.out.println("### Ordering an iPhone XS Max");
		IPhone iphoneXSMax = factoryIphone.orderIPhone("X","SMAX");
		System.out.println(iphoneXSMax);
	}
}
