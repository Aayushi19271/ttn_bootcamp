package aayushi;

interface Ques1Interface{
    public boolean greater(int a,int b);
}

public class Ques1 {
    public static void main(String[] args) {

        Ques1Interface obj = (a,b) -> {
                return (a>b) ? true:false;
            };

        System.out.println(obj.greater(2,3));
    }
}
