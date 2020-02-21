package aayushi;
import java.util.Arrays;
import java.util.LinkedHashSet;

//Write a method that takes a string and
// returns the number of unique characters in the string.
public class Question2 {
    public static String[] findunique(String str)
    {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i=0;i<str.length();i++)
        {
            set.add(String.valueOf(str.charAt(i)));
        }

        String[] arrayOfString = set.toArray(new String[0]);
        return arrayOfString;
    }

    public static void main(String[] args) {
        String str = "aayushi Thani";
        String[] arrayOfString =findunique(str);
        System.out.println("Array of String: " + Arrays.toString(arrayOfString));
    }
}
