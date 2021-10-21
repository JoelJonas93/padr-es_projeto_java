package br.com.cod3r.factory.apple._simpleFactory.simpleFactory;

import br.com.cod3r.factory.apple._simpleFactory.model.IPhone;
import br.com.cod3r.factory.apple._simpleFactory.model.IPhone11;
import br.com.cod3r.factory.apple._simpleFactory.model.IPhone11Pro;
import br.com.cod3r.factory.apple._simpleFactory.model.IPhoneX;
import br.com.cod3r.factory.apple._simpleFactory.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

    public IPhone orderIPhone(String generation, String model){
        IPhone device = null;

        device = createIPhone(generation, model);

        if(device != null){
            device.assemble();
            device.certificates();
            device.getHardware();
            device.pack();
        }

        return device;
    }

    protected IPhone createIPhone(String generation, String model){
        if("11".equals(generation)){
            if("standard".equals(model)){
                return new IPhone11();
            } else if("pro".equals(model)){
                return new IPhone11Pro();
            }
        } else if("X".equals(generation)){
            if("standard".equals(model)){
                return new IPhoneX();
            } else if("SMAX".equals(model)){
                return new IPhoneXSMax();
            }
        }
        return null;
    }
	
}
