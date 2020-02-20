package aayushi;
//create a thread using Runnable interface

class TestB implements Runnable {
    public void run()
    {
        System.out.println("Run method executed by child Thread");
    }
    public void m1()
    {
        System.out.println("Hello Visitors");
    }
}

public class Question2B {
    public static void main(String[] args) {
        TestB t = new TestB();
        t.m1();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Main method executed by main thread");
    }
}


