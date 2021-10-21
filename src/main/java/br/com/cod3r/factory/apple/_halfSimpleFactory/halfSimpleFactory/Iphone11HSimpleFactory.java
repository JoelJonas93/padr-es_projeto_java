package br.com.cod3r.factory.apple._halfSimpleFactory.halfSimpleFactory;

import br.com.cod3r.factory.apple._halfSimpleFactory.model.IPhone11;
import br.com.cod3r.factory.apple._halfSimpleFactory.model.IPhone;
import br.com.cod3r.factory.apple._halfSimpleFactory.model.IPhone11Pro;

public class Iphone11HSimpleFactory extends IPhoneHSimpleFactory {
    
    @Override
    protected IPhone createIPhone(String model) {
        if("standard".equals(model)){
            return new IPhone11();
        } else if("pro".equals(model)){
            return new IPhone11Pro();
        } else {
            return null;
        }
    }

}
