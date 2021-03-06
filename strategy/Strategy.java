package main.java.com.usher.DesignPatterns.strategy;

/**
 * 策略模式：定义了算法族，分别封装起来，让它们之间可以互相替换。
 * 此模式让算法的变化独立于使用算法的客户。
 *
 * 在策略模式中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 *
 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。
 策略对象改变 context 对象的执行算法。

 应用场景如下。
 a、 一件事情，有很多方案可以实现。
 b、我可以在任何时候，决定采用哪一种实现。
 c.、未来可能增加更多的方案。
 d、 策略模式让方案的变化不会影响到使用方案的客户。

 实例：
 系统的操作都要有日志记录，通常会把日志记录在数据库里面，方便后续的管理，
 但是在记录日志到数据库的时候，可能会发生错误，比如暂时连不上数据库了，
 那就先记录在文件里面。日志写到数据库与文件中是两种算法，但调用方不关心，
 只负责写就是。
 */
public interface Strategy {
    public int doOperation(int num1,int num2);
}
