/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test1;

/**
 * 死锁
 *
 * @author: guojixian
 * @create: 2018-06-04 21:41
 **/
public class Run {

    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();

            Thread.sleep(100);

            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
