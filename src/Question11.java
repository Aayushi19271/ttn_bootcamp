package aayushi;
class Bank
{
    double rateOfInterest;
    Bank(){}
    Bank(double r) { rateOfInterest = r; }

    public void getDetails(){
        System.out.println(rateOfInterest);
    }
}

class SBI extends Bank{
    double rateOfInterest;
    SBI(double r) { rateOfInterest = r; }
    public void getDetails(){
        System.out.println("SBI interest rate: "+rateOfInterest);
    }
}

class BOI extends Bank{
    double rateOfInterest;
    BOI(double r) { rateOfInterest = r; }
    public void getDetails(){
        System.out.println("BOI interest rate: "+rateOfInterest);
    }
}
class ICICI extends Bank{
    double rateOfInterest;
    ICICI(double r){ rateOfInterest = r; }
    public void getDetails(){
        System.out.println("ICICI interest rate: "+rateOfInterest);
    }
}

public class Question11 {
    public static void main(String[] args)
    {
        Bank b = new Bank(0.0);
        Bank b1 = new SBI(8.2);
        Bank b2 = new BOI(6.4);
        Bank b3 = new ICICI(8.5);
        b.getDetails();
        b1.getDetails();
        b2.getDetails();
        b3.getDetails();
    }
}


