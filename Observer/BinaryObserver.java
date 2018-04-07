package main.java.com.usher.DesignPatterns.Observer;

/**
 * 实体观察者类
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

    }
}
