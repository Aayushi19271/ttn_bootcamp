package aayushi;

//Q1. Write a program to replace a substring inside a string with other string ?
public class Question1 {
    public static void main(String args[]){
        String str = "big black bug bit a big black dog on his big black nose  \n";
        System.out.println( str.replace( 'b','a' ) );
        System.out.println( str.replaceFirst("black", "White") );
        System.out.println( str.replaceAll("big", "small") );
    }
}
