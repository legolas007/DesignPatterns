package main.java.com.usher.DesignPatterns.singleton;

/**
 * 线程池、缓存、对话框、处理器偏好设置和注册表的对象等等
 * 确保一个类只有一个实例，并提供了一个全局访问点
 * 类图：
 * 使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。
 * 私有构造函数保证了不能通过构造函数来创建对象实例，
 * 只能通过公有静态函数返回唯一的私有静态变量
 */

/**
 * 懒汉式-线程不安全
 * 私有静态变量 uniqueInstance 被延迟实例化，
 * 这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，
 * 从而节约资源。
 这个实现在多线程环境下是不安全的，
 如果多个线程能够同时进入 if(uniqueInstance == null) ，
 那么就会多次实例化 uniqueInstance。
 */
public class Singleton {
    // 利用一个静态变量来记录Singleton的唯一实例。
    private static Singleton uniqueInstance;

    // 把构造器声明为私有的，只有Singleton类内才可以调用构造器。
    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            // 如果uniqueInstance是空的，我们就利用私有的构造器产生一个Singleton实例并
            // 把它赋值给uniqueInstance静态变量中。请注意，如果我们不需要这个实例，它就
            // 永远不会产生。这就是“延迟实例化”
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

