import java.util.*;
class Liter28
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter volume in liters");
       double liters=sc.nextDouble();
        double mili=liters*1000;
        System.out.println("volume in milli_liters="+mili);

         System.out.println("enter distance in kilometer");
       double kilo=sc.nextDouble();
        double meter=kilo*1000;
        System.out.println("distance in meters="+meter);


       
    }
}


