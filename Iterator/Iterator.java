package main.java.com.usher.DesignPatterns.Iterator;

/**
 * 提供一种方法访问一个聚合对象中的各个元素，而又无需暴露改对象的内部表示
 *
 * 应用场景：遍历一个聚合对象,当你需要访问一个聚集对象，
 * 而且不管这些对象是什么都需要遍 历的时候，
 * 就应该考虑用迭代器模式。
 *
 * 实例：JAVA 中的 iterator
 *
 * 创建一个叙述导航方法的 Iterator 接口和一个返回迭代器的 Container 接口
 * 实现了 Container 接口的实体类将负责实现 Iterator 接口
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
