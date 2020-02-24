package aayushi;
import java.util.Arrays;

public class Ques11 {
    public static void main(String[] args) {
        System.out.println(
        Arrays.asList(1,2,3,4,5,6)
                .stream()
                .mapToInt(e->e*2)
                .average().orElse(-1)
        );

    }
}
