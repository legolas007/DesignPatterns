package main.java.com.usher.DesignPatterns.singleton;

/**
 * 懒汉式-线程安全
 * 假如有两个线程同时调用Singleton.getInstance()，
 * 而这时uniqueInstance还没有初始化，
 * 那么有可能会出现调用Singleton.getInstance()方法返回不同的实例
 * 
 * 只需要对 getUniqueInstance() 方法加锁，
 * 那么在一个时间点只能有一个线程能够进入该方法，
 * 从而避免了对 uniqueInstance 进行多次实例化的问题。
 * 但是这样有一个问题，就是当一个线程进入该方法之后，
 * 其它线程试图进入该方法都必须等待，因此性能上有一定的损耗
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() {

    }

    // 通过增加synchronized关键字到getInstance()方法中，我们
    // 迫使每个线程在进入这个方法之前，要先等候别的线程离开该方法。
    // 也就是说，不会有两个线程可以同时进入这个方法。
    public static synchronized Singleton2 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
