package aayushi;

class Singleton
{
    private static Singleton single_instance = null;        // static variable single_instance of type Singleton
    public String s;

    private Singleton()         // private constructor restricted to this class itself
    {
        s = "Private constructor of Singleton class";
    }

    public static Singleton getInstance()       // static method to create instance of Singleton class
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();          // instantiating Singleton class with variable x
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.s = (x.s).toUpperCase();              // changing variable of instance x

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
    }
}

