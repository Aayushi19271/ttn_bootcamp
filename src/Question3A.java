package aayushi;

public class Question3A {
    private int count=0;
    public synchronized void counter()
    {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Question3A t1 = new Question3A();
        t1.dowork();
    }

    public void dowork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<1000;i++)
                    counter();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<1000;i++)
                    counter();
            }
        });
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }

        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("The counter is :"+count);
    }
}
