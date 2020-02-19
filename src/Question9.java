package aayushi;
//Q9.Write a program to display values of enums
// using a constructor & getPrice()
// method (Example display house & their prices)


public class Question9 {
    enum House {
        House1(25000), House2(30000), House3(50000), House4(15000), House5(20000);
        private int price;
        House(int p)
        {
            price = p;
        }
        int getPrice() {
            return price;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("All house prices:");
        for (House h : House.values()) System.out.println(h + " costs " + h.getPrice() + " Rupees");
    }
}
