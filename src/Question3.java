package aayushi;

import java.util.Scanner;

//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
public class Question3 {
        public static void main(String[] args)
        {
            String str = "big black bug bit a big black";
            int count = str.length() - str.replace("a", "").length();
            System.out.println("Number of occurrences of 'a' in "+str+" = "+count);
        }
}
