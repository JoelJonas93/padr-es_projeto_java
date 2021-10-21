package br.com.cod3r.factory.apple._factory.factory;

import br.com.cod3r.factory.apple._factory.model.IPhone;
import br.com.cod3r.factory.apple._factory.model.IPhone11Pro;

public class Iphone11ProFactory extends IPhoneFactory {
    
    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }

}
