package main.java.com.usher.DesignPatterns.AbstractFactory;

public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
