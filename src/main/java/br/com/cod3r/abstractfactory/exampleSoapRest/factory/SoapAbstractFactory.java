package br.com.cod3r.abstractfactory.exampleSoapRest.factory;

import br.com.cod3r.abstractfactory.exampleSoapRest.services.CarService;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.UserService;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.UserSoapService;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.CarSoapService;

public class SoapAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserSoapService();
    }

    @Override
    public CarService getCarService() {
        return new CarSoapService();
    }

}
