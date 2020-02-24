package aayushi;

interface Ques1CInterface{
    public String concat(String x,String y);
}

public class Ques1C {
    public static void main(String[] args) {
        Ques1CInterface obj = (x,y) -> {
                return x+y;
        };

        System.out.println(obj.concat("aayushi","thani"));
    }
}
