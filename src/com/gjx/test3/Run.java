/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test3;

/**
 * @author: guojixian
 * @create: 2018-06-04 23:06
 **/
public class Run {

    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.setName("AA");
        threadA.start();
        ThreadB threadB = new ThreadB(task);
        threadB.setName("BB");
        threadB.start();
    }
}
