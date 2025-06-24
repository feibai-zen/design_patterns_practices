package com.feibai.study.designpatterns.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 静态内部类实现单例模式
 * <p>
 * 1.外部类没有 static 属性，则不会像饿汉式那样立即加载对象
 * 2.只有调用 getInstance()，才会加载静态内部类。加载类时是线程安全的。instance 是 static final 类
 * 型，保证了内存中只有一个实例存在，而且只能被赋值一次，从而保证了线程安全性。
 * 3.兼备了高效调用和延迟加载的优势。加载 SingletonInnerStaticClass 类时，不会初始化静态内部类，因此具有懒加载。
 *
 * @author feibai
 */
public class IdGeneratorSingleton_InnerStaticClass {
    
    private final AtomicLong id = new AtomicLong();

    private IdGeneratorSingleton_InnerStaticClass() {
    }

    private static class Inner {
        //静态内部类可以访问外层类
        private static final IdGeneratorSingleton_InnerStaticClass INSTANCE =
                new IdGeneratorSingleton_InnerStaticClass();
    }

    public static IdGeneratorSingleton_InnerStaticClass getInstance() {

        return Inner.INSTANCE;
    }

    public Long getId() {

        return id.incrementAndGet();
    }

}
