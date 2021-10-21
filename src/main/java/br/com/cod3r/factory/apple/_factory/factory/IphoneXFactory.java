package br.com.cod3r.factory.apple._factory.factory;

import br.com.cod3r.factory.apple._factory.model.IPhone;
import br.com.cod3r.factory.apple._factory.model.IPhoneX;

public class IphoneXFactory extends IPhoneFactory{
    
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }

}
