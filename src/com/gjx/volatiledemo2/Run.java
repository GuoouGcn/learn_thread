/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.volatiledemo2;

/**
 * 1. 成员变量需要用static修饰, 因为所有线程需要公用一个count
 * 2. 不使用sychronizde会出问题, volatile不能保证数据的同步
 *
 * @author: guojixian
 * @create: 2018-06-05 21:59
 **/
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i].start();
        }
    }
}
