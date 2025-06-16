package com.feibai.study.designpatterns.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 线程级别的 单例模式
 * <p>
 * 每个线程，都具有一个单例对象
 */

public class IdGeneratorSingleton_Thread_Level {
    private final AtomicLong id = new AtomicLong(0);

    private static final ConcurrentHashMap<Long, IdGeneratorSingleton_Thread_Level> instances = new ConcurrentHashMap<>();

    private IdGeneratorSingleton_Thread_Level() {

    }

    public static IdGeneratorSingleton_Thread_Level getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGeneratorSingleton_Thread_Level());

        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }

}

