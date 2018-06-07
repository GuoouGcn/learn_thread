/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.volatiledemo1;

/**
 *
 * 1. main线程死循环
 *
 * 私有堆栈中的值和公共堆栈中的值不同步造成
 * @author: guojixian
 * @create: 2018-06-05 21:35
 **/
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();

        new Thread(printString).start();
        System.out.println("我要停止他! stopThread=" + Thread.currentThread().getName());
        printString.setContinuPrint(false);
    }

}
