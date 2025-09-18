package com.feibai.study.designpatterns.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 枚举方式实现单例模式
 * <p>
 * 优点：1.实现简单 2.枚举本身就是单例模式。由JVM从根本上提供保障，避免通过反射和反序列化的漏洞。
 * <p>
 * 缺点：无法延迟加载
 *
 * @author feibai
 */
public enum IdGeneratorSingleton_Enum {

    INSTANCE;
    private final AtomicLong id = new AtomicLong(0);

    public Long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        IdGeneratorSingleton_Enum instancEnum = IdGeneratorSingleton_Enum.INSTANCE;
        IdGeneratorSingleton_Enum instancEnum1 = IdGeneratorSingleton_Enum.INSTANCE;
        IdGeneratorSingleton_Enum instancEnum2 = IdGeneratorSingleton_Enum.INSTANCE;
        System.out.println(instancEnum == instancEnum1);
        System.out.println(instancEnum1 == instancEnum2);
    }
}
