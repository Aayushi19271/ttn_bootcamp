 package aayushi;
//Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.
public class Question4 {
        public static void main(String[] args) {
            String str = "**Big black bug Bit a big blAck 1 2 3**";
            int uCount = 0,lCount=0,dCount=0,sCount=0;
            float uPercent=1, lPercent=1, dPercent=1, sPercent=1;

            for (int i = 0; i < str.length(); i++)
            {
                char a = str.charAt(i);
                if (Character.isUpperCase(a))
                    uCount++;
                else if (Character.isLowerCase(a))
                    lCount++;
                else if (Character.isDigit(a))
                    dCount++;
                else
                    sCount++;
            }
            uPercent=(uCount*100)/(str.length());
            lPercent=(lCount*100)/(str.length());
            dPercent=(dCount*100)/(str.length());
            sPercent=(sCount*100)/(str.length());
            System.out.println("Count of uppercase characters is:"+uCount+ "    Percentage of uppercase Characters is:"+uPercent);
            System.out.println("Count of lowercase characters is:"+lCount+ "    Percentage of lowercase Characters is:"+lPercent);
            System.out.println("Count of digits is:"+dCount+ "  Percentage of digits is:"+dPercent);
            System.out.println("Count of special characters is:"+uCount+ "  Percentage of special Characters is:"+uPercent);
        }
}
