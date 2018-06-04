/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test3;

/**
 * @author: guojixian
 * @create: 2018-06-04 23:05
 **/
public class ThreadB extends Thread {
    private Task task;
    public ThreadB(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
