package aayushi;

import java.util.Arrays;

public class Ques10 {
    public static void main(String[] args) {
        System.out.println(
        Arrays.asList(1,2,3,4,5,6,7)
                .stream()
                .filter(e->e>5)
                .mapToInt(e->e)
                .sum()
        );
    }
}
