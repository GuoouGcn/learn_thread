/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.volatiledemo;

/**
 * @author: guojixian
 * @create: 2018-06-05 20:01
 **/
public class PrintString {

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
}
