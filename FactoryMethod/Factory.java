package main.java.com.usher.DesignPatterns.FactoryMethod;

import main.java.com.usher.DesignPatterns.SimpleFactory.Product;

/**
 * 定义一个创建对象的接口，但是由子类决定要实例化那个类，
 * 工厂方法把实例化推迟到子类
 * 实例：java.util.Collection 接口的 iterator 方法，hibernate里通过sessionFactory创建session
 * 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象
 */
public abstract class Factory {
    public abstract Product factoryMethod();
    public void doSomething(){
        Product product = factoryMethod();
    }
}
