/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test2;

/**
 * @author: guojixian
 * @create: 2018-06-04 21:56
 **/
public class Service {

    public static void print(String stringParam) {
        try {
            synchronized(stringParam) {
                while (true) {
                    System.out.println("currentThreadName = " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
