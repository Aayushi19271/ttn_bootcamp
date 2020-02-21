package aayushi;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        float sum=0;
        List<Float> arrlist = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        for (int i=0;i<5;i++)
        {
            float n = sc.nextFloat();
            arrlist.add(n);
        }

        ListIterator<Float> iterator = arrlist.listIterator();
        while (iterator.hasNext())
        {
            sum = sum + iterator.next();
        }
        System.out.println("The elements are: "+arrlist);
        System.out.println("The sum is :"+ sum);
    }
}
