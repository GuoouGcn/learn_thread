/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.volatiledemo2;

/**
 * @author: guojixian
 * @create: 2018-06-05 21:57
 **/
public class MyThread extends Thread {
    volatile private static int count;
    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
