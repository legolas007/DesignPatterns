package main.java.com.usher.DesignPatterns.AbstractFactory;

/**
 * 提供一个产品类的接口，产品类均要实现这个接口
 *提供一个工厂类的接口。工厂类均要实现这个接口(即抽象工厂)。
 由工厂实现类创建产品类的实例。工厂实现类应有一个方法，用来实例化产品类。
 提供多个工厂实现类。工厂实现类分别构造不通产品族的产品。

 *实例：
 *
 *应用场景: 在编码时不能预见需要创建哪种类的实例。系统不应依赖于产品类实例如何被创建、组合和表达的细节。
 *
 * 抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，
 * 并且这些对象是相关的，也就是说必须一起创建出来。
 * 而工厂模式只是用于创建一个对象，这和抽象工厂模式有很大不同。
 抽象工厂模式用到了工厂模式来创建单一对象，

 至于创建对象的家族这一概念是在 Client 体现，
 Client 要通过 AbstractFactory 同时调用两个方法来创建出两个对象，
 在这里这两个对象就有很大的相关性，Client 需要同时创建出这两个对象。
 从高层次来看，抽象工厂使用了组合，即 Cilent 组合了 AbstractFactory，
 而工厂模式使用了继承
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
