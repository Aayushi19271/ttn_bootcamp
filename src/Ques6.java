package aayushi;

interface Ques6interface{
    default void display(){
        System.out.println("Interface Default Display Method");
    }

    static void show(){
        System.out.println("Interface Static Show Method");
    }
}

public class Ques6 implements Ques6interface{
    public static void main(String[] args) {
        Ques6interface.show();
        Ques6 obj = new Ques6();
        obj.display();
    }
}
