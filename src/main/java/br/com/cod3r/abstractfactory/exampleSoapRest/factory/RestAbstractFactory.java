package br.com.cod3r.abstractfactory.exampleSoapRest.factory;

import br.com.cod3r.abstractfactory.exampleSoapRest.services.CarRestService;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.CarService;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.UserRestService;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return (UserService) new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return (CarService) new CarRestService();
    }
    
}
