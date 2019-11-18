package com.company;
public class Deadlock implements Runnable  {
    private A a;
    private B b;

    public Deadlock() throws InterruptedException {
        a = new A();
        b = new B();
        Thread.currentThread().setName("MainThread");
        Thread thread = new Thread(this);
        thread.start();
        a.fA(b);
        System.out.println("fA done");
    }

    @Override
    public void run() {
        try {
            b.fB(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("fB done");

    }



}
