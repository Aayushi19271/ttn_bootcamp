package aayushi;
//Q5. Find common elements between two arrays.
public class Question5 {

    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 = {1, 0, 6, 1, 6, 4, 7, 0};

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == (arr2[j]))
                {
                    System.out.println("Common element is : "+(arr1[i]));
                    break;
                }
            }
        }
    }
}
