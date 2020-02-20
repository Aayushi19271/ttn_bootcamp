package aayushi;
import java.lang.Cloneable;
//WAP to show object cloning in java using cloneable and copy constructor both.

public class Question5 implements Cloneable{
    int number;
    String str;

    Question5(int number , String str){
        this.number = number;
        this.str= str;
    }

    Question5(Question5 obj){
        System.out.println("Copy Constructor called!!!");
        number= obj.number;
        str= obj.str;

    }

    public Object clone()throws CloneNotSupportedException{
        System.out.println("Clone function Called !!!");

        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        try{


            Question5 originalObject1 = new Question5(1,"Aayushi");
            System.out.println(originalObject1.number+" " + originalObject1.str);

            Question5 cloneableObject2 = (Question5) originalObject1.clone();
            System.out.println(cloneableObject2.number+" " + cloneableObject2.str);

            Question5 copyConstructorObject3 =new Question5(originalObject1);
            System.out.println(copyConstructorObject3.number+" " + copyConstructorObject3.str);

        }
        catch (CloneNotSupportedException cnse){}


    }
}


