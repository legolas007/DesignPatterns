package main.java.com.usher.DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式又被称作发布/订阅模式，定义了对象间一对多依赖，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 * 观察者模式属于行为型模式
 *
 * 一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 应用场景如下：
 a、对一个对象状态的更新，需要其他对象同步更新，而且其他对象的数量动态可变。
 b、对象仅需要将自己的更新通知给其他对象而不需要知道其他对象的细节。

 观察者模式使用三个类 Subject、Observer 和 Client。
 Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法。
 我们创建 Subject 类、Observer 抽象类和扩展了抽象类 Observer 的实体类。
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
