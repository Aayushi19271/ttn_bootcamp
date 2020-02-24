package aayushi;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        System.out.println(
        Arrays.asList(1,2,3,4,5,6)
                .stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList())
        );
    }
}
