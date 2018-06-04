/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test3;

/**
 * @author: guojixian
 * @create: 2018-06-04 23:02
 **/
public class ThreadA extends Thread {
    private Task task;
    public ThreadA(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
