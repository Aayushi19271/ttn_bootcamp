package aayushi;
// Java program to illustrate
// NoClassDefFoundError

class ExceptionExample {
    public void print(){
        System.out.println("Hello");
    }
}

public class Question3 {
    public static void main(String[] args) {
        ExceptionExample e = new ExceptionExample();
        e.print();
        }
}
