package br.com.cod3r.factory.apple._halfSimpleFactory;

import br.com.cod3r.factory.apple._halfSimpleFactory.halfSimpleFactory.IPhoneHSimpleFactory;
import br.com.cod3r.factory.apple._halfSimpleFactory.halfSimpleFactory.Iphone11HSimpleFactory;
import br.com.cod3r.factory.apple._halfSimpleFactory.halfSimpleFactory.IphoneXHSimpleFactory;
import br.com.cod3r.factory.apple._halfSimpleFactory.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		System.out.println("### Using Half SimpleFactory");

		// Criação de cada factory dos grupo de iphone
		IPhoneHSimpleFactory factoryIphone11 = new Iphone11HSimpleFactory();
		IPhoneHSimpleFactory factoryIphoneX = new IphoneXHSimpleFactory();
		
		System.out.println("### Ordering an iPhone 11");
		IPhone iphone11 = factoryIphone11.orderIPhone("standard");
		System.out.println(iphone11);

		System.out.println("### Ordering an iPhone 11 Pro");
		IPhone iphone11Pro = factoryIphone11.orderIPhone("pro");
		System.out.println(iphone11Pro);

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = factoryIphoneX.orderIPhone("standard");
		System.out.println(iphoneX);

		System.out.println("### Ordering an iPhone XS Max");
		IPhone iphoneXSMax = factoryIphoneX.orderIPhone("SMAX");
		System.out.println(iphoneXSMax);
	}
}
