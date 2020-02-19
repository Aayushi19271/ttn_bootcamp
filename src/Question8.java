package aayushi;
//Q8. Write a program to reverse a string
// and remove character from index 4 to index 9
// from the reversed string using String Buffer

public class Question8 {
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("Java is a Object-Oriented Programming language");
        System.out.println("Original string: "+str);
        str.reverse();
        System.out.println("Reversed string: " + str);
        str.delete(4, 10);
        System.out.println("Resulting string after deletion: " + str);
    }
}
