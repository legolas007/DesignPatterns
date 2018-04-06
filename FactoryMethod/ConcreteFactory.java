package main.java.com.usher.DesignPatterns.FactoryMethod;

import main.java.com.usher.DesignPatterns.SimpleFactory.ConcreteProduct;
import main.java.com.usher.DesignPatterns.SimpleFactory.Product;

public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
