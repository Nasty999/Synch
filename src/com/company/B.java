package com.company;
public class B {

    synchronized void fB(A a) throws InterruptedException {
        String name = Thread.currentThread().getName();
        System.out.println("fB: " + name);
        //this.notify();
        Thread.sleep(1000);
        System.out.println(name + " trying to call A");
        a.callA();
    }

    synchronized void callB() {
        System.out.println("callB");
    }



}

