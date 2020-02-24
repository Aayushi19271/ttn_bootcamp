package aayushi;

@FunctionalInterface
interface Ques2Interface{
    public int add(int x, int y);
}

public class Ques2 {
    public static void main(String[] args) {

        Ques2Interface obj = (x,y) -> {
                return x+y;
        };

        System.out.println("The addition is:"+ obj.add(5,6));
    }
}
