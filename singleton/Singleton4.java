package main.java.com.usher.DesignPatterns.singleton;

/**
 * 双重校验锁-线程安全
 * uniqueInstance 只需要被实例化一次，之后就可以直接使用了。
 * 加锁操作只需要对实例化那部分的代码进行。也就是说，
 * 只有当 uniqueInstance 没有被实例化时，才需要进行加锁。
 双重校验锁先判断 uniqueInstance 是否已经被初始化了，如果没有被实例化，
 那么才对实例化语句进行加锁。
 这个做法可以帮你大大地减少getInstance()的时间耗费
 */
public class Singleton4 {
    // volatile关键词确保，当uniqueInstance变量被初始化成Singleton实例时，

    // 多个线程正确地处理uniqueInstance变量
    private volatile static Singleton4 uniqueInstance;
    private Singleton4(){

    }
    public static synchronized Singleton4 getUniqueInstance(){
        // 检查实例，如果不存在，就进入同步区块。
        if (uniqueInstance == null){
            // 注意，只有第一次才彻底执行这里的代码
            synchronized (Singleton4.class){
                // 进入区块后，再检查一次。如果仍是null，才创建实例
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
