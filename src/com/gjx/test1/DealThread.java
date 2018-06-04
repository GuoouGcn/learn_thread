/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.gjx.test1;

/**
 * @author: guojixian
 * @create: 2018-06-04 19:34
 **/
public class DealThread implements Runnable {

    private String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();
    public void setFlag(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if ("a".equals(username)) {
            synchronized(lock1) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized(lock2) {
                    System.out.println("按 lock1->lock2代码顺序执行");
                }
            }
        }

        if ("b".equals(username)) {
            synchronized(lock2) {
                try {
                    Thread.sleep(3000);
                    System.out.println("username = " + username);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized(lock1) {
                    System.out.println("按 lock2->lock1代码顺序执行");
                }
            }
        }
    }
}
