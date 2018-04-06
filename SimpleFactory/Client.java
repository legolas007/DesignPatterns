package main.java.com.usher.DesignPatterns.SimpleFactory;

public class Client {
    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(2);
    }
}
