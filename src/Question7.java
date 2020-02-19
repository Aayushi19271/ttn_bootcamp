package aayushi;
public class Question7 {
    static int age;
    static String fName;
    static String lName;

    static
    {
        age = 25;
        fName = "Aayushi";
        lName = "Thani";
    }

    public static void print(int a, String fn, String ln){
        age = a;
        fName = fn;
        lName = ln;
        System.out.println("Age: "+age + "      First name: "+fName+"      Last name: "+lName);
    }

    public static void main(String[] args) {
        System.out.println("Age is: "+age);
        System.out.println("First name is: "+fName);
        System.out.println("Last name is: "+lName);
        Question7.print(25,"Aayushi","Thani");
    }
}







