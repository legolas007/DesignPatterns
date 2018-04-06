package main.java.com.usher.DesignPatterns.FactoryMethod;

import main.java.com.usher.DesignPatterns.SimpleFactory.ConcreteProduct2;
import main.java.com.usher.DesignPatterns.SimpleFactory.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
