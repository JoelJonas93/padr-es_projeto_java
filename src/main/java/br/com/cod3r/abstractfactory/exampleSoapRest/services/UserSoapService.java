package br.com.cod3r.abstractfactory.exampleSoapRest.services;

public class UserSoapService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Salvando " + name + " usando o serviço SOAP");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Deletando User com id " + id + " usando o serviço SOAP");
        return true;
    }
}
