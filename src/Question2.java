package aayushi;
import java.util.HashMap;
//Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
public class Question2 {
    public static void main(String args[]) {
        int count=0;
        String str = "big black bug bit a big black dog on his big black nose";
        String[] str_array = str.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>(); //hashmap <key,value>
        for(String word:str_array)
        {
            if(map.containsKey(word))
            {
                count=map.get(word); //used to fetch the values mapped by a particular key, return NULL if no mapping
                map.put(word,count+1); //increment the count by 1
            }
            else
            {
                map.put(word,1); //if not exist already, then put count = 1
            }
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));


        //System.out.println(map);
    }
}
