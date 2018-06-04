/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test2;

/**
 * JVM中具有String常量池缓存功能
 *
 * @author: guojixian
 * @create: 2018-06-04 22:07
 **/
public class Run {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        threadB.start();
    }
}
