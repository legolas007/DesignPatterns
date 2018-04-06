package main.java.com.usher.DesignPatterns.singleton;

/**
 * 饿汉式-线程安全
 * 线程不安全问题主要是由于 uniqueInstance 被实例化了多次，
 * 如果 uniqueInstance 采用直接实例化的话，
 * 就不会被实例化多次，也就不会产生线程不安全问题。
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的优势
 *
 * 我们依赖JVM在加载这个类时马上创建此唯一的单件实例。
 * JVM保证在任何线程访问uniqueInstance静态变量之前，一定先创建此实例。
 */
public class Singleton3 {
    // 在静态初始化器中创建单件。这段代码保证了线程安全
    private static Singleton3 uniqueInstance = new Singleton3();

    private Singleton3(){

    }

    public static Singleton3 getUniqueInstance(){
        return uniqueInstance;
    }
}
