package br.com.rodrigofreitas.meuapp.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWordService {

    public String getHelloWithName(String name) {
        return "Seja bem-vindo ao quarkus, sr: " + name;
    }

}
