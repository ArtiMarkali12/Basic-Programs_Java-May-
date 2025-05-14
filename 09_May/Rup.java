
import java.util.*;
class Rup
{
    public static void main(String arg[])
    {
        int rup ,five_hun,two_hun,one_hun,fifty,twenty,five,two,one;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Rupees:-");
        rup=sc.nextInt();
        int total=rup;

        five_hun=rup/500;
        rup=rup%500;

            System.out.println("500* "+five_hun+"  =  "+(500*five_hun));

        two_hun=rup/200;
        rup=rup%200;

          System.out.println("200* "+two_hun+"  =  "+(200*two_hun));

        one_hun=rup/100;
        rup=rup%100;

        System.out.println("100* "+one_hun+"  =   "+(100*one_hun));

        fifty=rup/50;
        rup=rup%50;

        System.out.println("50* "+fifty+"  =    "+(100*fifty));

        twenty=rup/20;
        rup=rup%20;

        System.out.println("20* "+twenty+"  =   "+(20*twenty));

        five=rup/5;
        rup=rup%5;
        System.out.println("5* "+five+"  =     "+(5*five));

        two=rup/2;
        rup=rup%2;
        System.out.println("2* "+two+  "  =     "+(2*two));

        System.out.println("1* "+rup+"  =     "+(1*rup));

        System.out.println("-----------------------------");
        System.out.println("total  =   "+total);
        
    }
}
