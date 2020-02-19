package aayushi;

public class Question6 {
    public static void main(String[] args)
    {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};

        int res = ar[0];
        for (int i = 1; i < ar.length; i++)
            res = res ^ ar[i];

        System.out.println("Element occurring once is " +res);
    }
}


