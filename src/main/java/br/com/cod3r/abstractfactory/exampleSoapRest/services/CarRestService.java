package br.com.cod3r.abstractfactory.exampleSoapRest.services;

public class CarRestService implements CarService {
    @Override
    public void save(String model) {
        System.out.println("Salvando carro " + model + " usando o serviço REST");
    }
    @Override
    public void update(String newModel) {
        System.out.println("Atualizando carro " + newModel + " usando o serviço REST");
    }
}
