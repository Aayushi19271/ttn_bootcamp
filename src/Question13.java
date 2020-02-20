package aayushi;

import java.util.Scanner;

//class NoStackTraceRuntimeException extends RuntimeException {
//    @Override
//    public synchronized Throwable fillInStackTrace() {
//        return this;
//    }
//}

public class Question13 {
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
            ex.fillInStackTrace();
        }
    }
}
