package aayushi;

public class Ques9 {
    public static void main(String[] args) {

        Chair woodenChair = new Chair("Godrej Interio",1300,"wooden");
        Chair metalChair = new Chair("Style Spa",3200,"metal");

        Table woodenTable = new Table("Godrej Interio",2400,"wooden");
        Table metalTable = new Table("Style Spas",5700,"metal");

        System.out.println("Details of Wooden Chair-------------------------------");
        System.out.println(woodenChair.manufacturer);
        System.out.println(woodenChair.price);
        System.out.println(woodenChair.type);
        System.out.println(woodenChair.fireTest());
        System.out.println(woodenChair.stessTest());

        System.out.println("Details of Metal Chair-------------------------------");
        System.out.println(metalChair.manufacturer);
        System.out.println(metalChair.price);
        System.out.println(metalChair.type);
        System.out.println(metalChair.fireTest());
        System.out.println(metalChair.stessTest());

        System.out.println("Details of Wooden Table-------------------------------");
        System.out.println(woodenTable.manufacturer);
        System.out.println(woodenTable.price);
        System.out.println(woodenTable.type);
        System.out.println(woodenTable.fireTest());
        System.out.println(woodenTable.stessTest());

        System.out.println("Details of Metal Table-------------------------------");
        System.out.println(metalTable.manufacturer);
        System.out.println(metalTable.price);
        System.out.println(metalTable.type);
        System.out.println(metalTable.fireTest());
        System.out.println(metalTable.stessTest());
    }

}

class Furniture{
    String manufacturer;
//    Date manufaturingDate;
    float price;

//    Furniture(){}
    Furniture(String manufacturer, float price){
        this.manufacturer = manufacturer;
//        this.manufaturingDate= manufaturingDate;
        this.price = price;
    }

    public String stessTest(){

        return "Stress Test Passed";
    }
    public String fireTest(){

        return "Fire Test Passed";
    }
}

class Chair extends Furniture{
    String type ;

    Chair(String manufacturer, float price, String type){
        super(manufacturer,price);
        this.type = type;
    }
}

class Table extends Furniture{
    String type ;

    Table(String manufacturer, float price, String type){
        super(manufacturer,price);
        this.type = type;
    }
}