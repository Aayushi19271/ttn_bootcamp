package aayushi;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {

        //CONSUMER FUNCTIONAL INTERFACE
        Consumer<Integer> consumer = (e1) -> {
            System.out.println("Consumer: " + e1);
        };
        consumer.accept(200);

        //SUPPLIER FUNCTIONAL INTERFACE
        Supplier<Integer> supplier = () -> {
            System.out.print("Supplier: ");
            return 100;
        };
        System.out.println(supplier.get());

        //PREDICATE FUNCTIONAL INTERFACE
        Predicate<Integer> predicate = (e) -> e%2==0; //even --returns boolean value
        System.out.println("Predicate: "+predicate.test(4));

        Predicate<String> predicate1 = (e) -> e.startsWith("no"); //checks whether the string starts with no.
        System.out.println("Predicate: "+predicate1.test("nope"));

        //FUNCTION FUNCTIONAL INTERFACE
        BiFunction<Integer,Long,Integer> bifun=(e, e1)-> e+ Integer.parseInt(e1.toString());
        System.out.println("Function: "+bifun.apply(10,20L));  //add
    }

}
