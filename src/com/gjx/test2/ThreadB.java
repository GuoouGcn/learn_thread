/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test2;

/**
 * @author: guojixian
 * @create: 2018-06-04 22:04
 **/
public class ThreadB extends Thread {
    private Service service;

    public ThreadB() {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.print("aaa");
    }
}
