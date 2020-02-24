package aayushi;

import java.util.Arrays;

//Find the first even number in the integer list which is greater than 3.
public class Ques12 {

    public static void main(String[] args) {
        System.out.println(
        Arrays.asList(1,2,3,4,5,6)
                .stream()
                .filter(e->e%2==0)
                .filter(e->e>3)
                .findFirst().orElse(-1)
        );
    }
}
