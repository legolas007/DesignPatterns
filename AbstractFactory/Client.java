package main.java.com.usher.DesignPatterns.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        abstractFactory = new ConcreteFactory2();
        productA = abstractFactory.createProductA();
    }
}
