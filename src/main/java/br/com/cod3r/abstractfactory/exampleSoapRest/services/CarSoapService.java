package br.com.cod3r.abstractfactory.exampleSoapRest.services;

public class CarSoapService implements CarService {
    @Override
    public void save(String model) {
        System.out.println("Salvando carro " + model + " usando o serviço SOAP");
    }
    @Override
    public void update(String newModel) {
        System.out.println("Atualizando carro " + newModel + " usando o serviço SOAP");
    }
}
