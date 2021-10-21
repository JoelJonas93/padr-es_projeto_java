package br.com.cod3r.factory.apple._halfSimpleFactory.halfSimpleFactory;

import br.com.cod3r.factory.apple._halfSimpleFactory.model.IPhone;

public abstract class IPhoneHSimpleFactory {

    public IPhone orderIPhone(String model){
        IPhone device = null;

        device = createIPhone(model);

        if(device != null){
            device.assemble();
            device.certificates();
            device.getHardware();
            device.pack();
        }

        return device;
    }

    protected abstract IPhone createIPhone(String model);
	
}
