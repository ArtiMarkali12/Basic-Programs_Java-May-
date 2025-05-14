import java.util.*;
class Vendor
{
    public static void main(String arg[])
    {
        double milk,t;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter The milk in liters:-");
        milk=sc.nextDouble();
       double total=milk/4;
       double a=(total*74.15)-(milk*60.25);
       System.out.println("profit="+a);
    }
}

    


