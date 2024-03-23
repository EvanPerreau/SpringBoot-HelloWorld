package fr.evanperreau.helloworld.service;

import fr.evanperreau.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
