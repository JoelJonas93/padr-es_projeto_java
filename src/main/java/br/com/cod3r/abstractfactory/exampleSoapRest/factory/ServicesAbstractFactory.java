package br.com.cod3r.abstractfactory.exampleSoapRest.factory;

import br.com.cod3r.abstractfactory.exampleSoapRest.services.CarService;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();
    CarService getCarService();
}
