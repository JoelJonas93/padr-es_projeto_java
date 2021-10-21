package br.com.cod3r.abstractfactory.exampleSoapRest;

import br.com.cod3r.abstractfactory.exampleSoapRest.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.exampleSoapRest.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.CarService;
import br.com.cod3r.abstractfactory.exampleSoapRest.services.UserService;

public class Client {
    public static void main(String[] args) {
        ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Joel");
        userService.delete(7);

        CarService carService = factory.getCarService();
        carService.save("Civic");
        carService.update("HRV");
    }
}
