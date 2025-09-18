package com.feibai.study.designpatterns.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    private static volatile IdGenerator instance;

    private final AtomicLong id = new AtomicLong(0);

    private IdGenerator() {
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized (IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }

        return instance;
    }

}
