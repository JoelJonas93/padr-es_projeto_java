package br.com.cod3r.factory.apple._factory.factory;

import br.com.cod3r.factory.apple._factory.model.IPhone;
import br.com.cod3r.factory.apple._factory.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IPhoneFactory{
    
    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }

}
