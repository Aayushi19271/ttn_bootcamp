package aayushi;

interface Defaultinterface{
    default void display(){
        System.out.println("Default Interface 1");
    }
}

interface Defaultinterface1{
    default void display(){
        System.out.println("Default Interface 2");
    }
}

public class Ques8 implements Defaultinterface,Defaultinterface1{
    public static void main(String[] args) {
        Ques8 obj = new Ques8();
        obj.display();
    }

    @Override
    public void display() {
        System.out.println("Main class Display");
    }
}
