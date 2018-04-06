package main.java.com.usher.DesignPatterns.AbstractFactory;

public class ConcreteFactory2  extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
