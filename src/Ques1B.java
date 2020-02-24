package aayushi;

interface Ques1BInterface{
    public int increment(int a);
}

public class Ques1B {
    public static void main(String[] args) {

        Ques1BInterface obj = (a)-> {
                return ++a;
            };

        System.out.println(obj.increment(5));
    }
}
