package aayushi;
import java.util.Scanner;
//6. WAP showing try, multi-catch and finally blocks.
public class Question6 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            int n1 = sc.nextInt();
            int res = n/n1;
            System.out.println("The division is:"+res);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic Exception"); // This exception occurs when an integer is divided by zero.
        }
        catch(NumberFormatException ex) //unable to format (convert) a string into a number.
        {
            System.out.println("Number Format Exception");
        }
        catch(Exception  ex)
        {
            System.out.println(ex.getStackTrace());
        }
        finally {
            System.out.println("This finally block of code is always executed");
        }
        System.out.println("This statement is executed if the exception is handled");
    }
}
