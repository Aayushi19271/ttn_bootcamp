package aayushi;

interface NewDefaultInterface
{
    default void display(){
        System.out.println("Interface Default Method");
    }
}

public class Ques7 implements NewDefaultInterface{
    public static void main(String[] args) {
        Ques7 obj = new Ques7();
        obj.display();
    }

    @Override
    public void display() {
        System.out.println("Main Class Display Method");
    }
}
