package aayushi;
//create a thread using Thread class
class TestA extends Thread {
    public void run() {
        System.out.println("Run method executed by child Thread");
    }
}

public class Question2A {
    public static void main(String[] args)
    {
        TestA t = new TestA();
        t.start();
        System.out.println("Main method executed by main thread");
    }
}
