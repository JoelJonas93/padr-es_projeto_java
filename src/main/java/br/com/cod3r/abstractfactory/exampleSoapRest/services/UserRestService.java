package br.com.cod3r.abstractfactory.exampleSoapRest.services;

public class UserRestService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Salvando " + name + " usando o serviço REST");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Deletando User com id " + id + " usando o serviço REST");
        return true;
    }
}
