package fr.evanperreau.helloworld.model;

public class HelloWorld {

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value = "Hello, World!";

    @Override
    public String toString() {
        return value;
    }
}
