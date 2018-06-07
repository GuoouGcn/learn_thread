/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.volatiledemo1;

/**
 * 这样可以解决死循环,但是一旦运行在 -server服务器模式中64bit的jvm上时,就会出现死循环, 解决办法使用volatile关键字
 *
 * @author: guojixian
 * @create: 2018-06-05 20:01
 **/
public class PrintString implements Runnable {

    private boolean isContinuPrint = true;

    public boolean isContinuPrint() {
        return isContinuPrint;
    }

    public void setContinuPrint(boolean continuPrint) {
        isContinuPrint = continuPrint;
    }

    public void pringStringMethod() {
        try {
            while (isContinuPrint) {
                System.out.println("run printStringMethod threadName= " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        pringStringMethod();
    }
}
