package br.com.cod3r.factory.apple._factory.factory;

import br.com.cod3r.factory.apple._factory.model.IPhone;
import br.com.cod3r.factory.apple._factory.model.IPhone11;

public class Iphone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
    
}
