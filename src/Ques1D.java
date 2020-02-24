package aayushi;

interface Ques1DInterface{
    public String uppercase(String str);
}

public class Ques1D {
    public static void main(String[] args) {

        Ques1DInterface obj = (str) -> {
                return str.toUpperCase();
        };

        System.out.println(obj.uppercase("aayushi"));
    }
}
