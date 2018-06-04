/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test3;

/**
 * @author: guojixian
 * @create: 2018-06-04 22:58
 **/
public class Task {

    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName= "
                    + Thread.currentThread().getName() + " i = " + (i + 1));
        }

        System.out.println("");

        synchronized(this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName= "
                        + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }
}
