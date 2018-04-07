package main.java.com.usher.DesignPatterns.Template;

/**
 * 模板方法模式中定义一个抽象类，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，
 * 继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 *为防止恶意操作，一般模板方法都加上 final 关键词
 *
 * 模板方法模式定义一个操作中的算法的骨架，将一些步骤延迟到子类中，
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些步骤。
 应用场景如下：
 对于一些功能，在不同的对象身上展示不同的作用，但是功能的框架是一样的。
 实例：spring 中对 Hibernate 的支持，将一些已经定好的方法封装起来，
 比如开启事务、获取 Session、关闭 Session 等，程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存。

 */
public abstract class Game {
    /**
     * 创建一个定义操作的 Game 抽象类，其中，模板方法设置为 final，这样它就不会被重写。
     * Cricket 和 Football 是扩展了 Game 的实体类，它们重写了抽象类的方法
     */
    //初始化游戏
    public abstract void initialize();
    //开始游戏
    public abstract void startPlay();
    //结束游戏
    public abstract void endPlay();

    //模板
    public final void play(){
        initialize();

        startPlay();

        endPlay();
    }
}
