/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test2;

/**
 * @author: guojixian
 * @create: 2018-06-04 21:59
 **/
public class ThreadA extends Thread {
    private Service service;

    public ThreadA() {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.print("aaa");
    }
}
