package aayushi;

//Q5. Find common elements between two arrays.

import java.util.Arrays;
import java.util.HashSet;

public class Question5_map {
    public static void main(String[] args)
    {
        Integer[] arr1 = {1, 2, 5, 5, 8, 9, 7, 10};
        Integer[] arr2 = {1, 0, 6, 1, 6, 4, 7, 0};

        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr1));

        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(arr2));

        set1.retainAll(set2);
        /*
        The retainAll() method of ArrayList is used to remove all the array
        list’s elements that are not contained in the specified collection.
         */
        System.out.println("The common elements between two arrays are:");
        System.out.println(set1);
    }
}
