package br.com.cod3r.factory.apple._factory.factory;

import br.com.cod3r.factory.apple._factory.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(){
        IPhone device = null;

        device = createIPhone();

        device.assemble();
        device.certificates();
        device.getHardware();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
	
}
