package aayushi;
public class Question10 {
    public static void main(String[] args)
    {
        Question10 obj = new Question10();
        int a = 5;
        int b = 6;
        double c = 5.5;
        double d = 6.5;
        float x = 2.4f;
        float y = 5.4f;
        String s1 = "Java";
        String s2 = "is";
        String s3 = "Good";
        obj.operations(a, b); //add int
        obj.operations(c, d);  //add double
        obj.multiply(x, y);  //multiply float
        obj.multiply(a,b);  //multiply int
        obj.operations(s1, s2);  //concat 2 strings
        obj.operations(s1, s2, s3);   //concat 3 strings
    }
    public void operations(int a, int b)
    {
        int sum = a + b;
        System.out.println(sum);
    }

    public void operations(double c, double d)
    {
        double sum = c + d;
        System.out.println(sum);
    }
    public void multiply(float x, float y)
    {
        float pro = x * y;
        System.out.println(pro);
    }
    public void multiply(int x,int y)
    {
        int pro = x * y;
        System.out.println(pro);
    }
    public void operations(String p, String q)
    {
        String con = p + q;
        System.out.println(con);
    }
    public void operations(String s1, String s2, String s3)
    {
        String con = s1 + s2 + s3;
        System.out.println(con);
    }
}



