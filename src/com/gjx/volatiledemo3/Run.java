/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.volatiledemo3;

/**
 * @author: guojixian
 * @create: 2018-06-05 22:33
 **/
public class Run {
    public static void main(String[] args) {
        AtomicIntegerTest atomicIntegerTest = new AtomicIntegerTest();
        Thread thread = new Thread(atomicIntegerTest);
        thread.start();
        Thread thread1 = new Thread(atomicIntegerTest);
        thread1.start();
        Thread thread2 = new Thread(atomicIntegerTest);
        thread2.start();

    }
}
