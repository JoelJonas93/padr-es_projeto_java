package br.com.cod3r.factory.apple._halfSimpleFactory.halfSimpleFactory;

import br.com.cod3r.factory.apple._halfSimpleFactory.model.IPhone;
import br.com.cod3r.factory.apple._halfSimpleFactory.model.IPhoneX;
import br.com.cod3r.factory.apple._halfSimpleFactory.model.IPhoneXSMax;

public class IphoneXHSimpleFactory extends IPhoneHSimpleFactory {
    
    @Override
    protected IPhone createIPhone(String model) {
        if("standard".equals(model)){
            return new IPhoneX();
        } else if("SMAX".equals(model)){
            return new IPhoneXSMax();
        } else {
            return null;
        }
    }

}
