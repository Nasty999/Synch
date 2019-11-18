package com.company;

public class A {
    synchronized void fA(B b) throws InterruptedException {
        String name = Thread.currentThread().getName();
        System.out.println("fA: " + name);
        //this.wait();
        Thread.sleep(1000);
        System.out.println(name + " trying to call B");
        b.callB();
    }

    synchronized void callA() {
        System.out.println("callA");
    }
}
