package aayushi;
import java.util.HashMap;

//Write a method that takes a string and print the number
// of occurrence of each character characters in the string.
public class Question3 {
    public static void occur(String str)
    {
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i =0 ; i < str.length(); i++)
        {
            if (map.containsKey(str.charAt(i)))
            {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "aayushithani";
        occur(str);
    }
}
