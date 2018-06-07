/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.volatiledemo3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: guojixian
 * @create: 2018-06-05 22:27
 **/
public class AtomicIntegerTest extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
