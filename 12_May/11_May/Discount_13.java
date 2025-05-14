//13. Accept amount and apply discount based on the amount range.

import java.util.Scanner;
public class Discount_13 
{
public static void main(String[] args) 
{
    double Discount;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Amount:");
    double amt=sc.nextInt();

    if(amt<5000)
    {
        System.out.println("No Discount");
    }
    else if(amt<10000)
    {
         Discount=0.05*amt;
        System.out.println("5% discount rate="+Discount);
        amt-=Discount;
        System.out.println("total amt="+amt);
    }
     else if(amt<20000)
    {
         Discount=0.1*amt;
        System.out.println("10% discount rate="+Discount);
         amt-=Discount;
        System.out.println("total amt="+amt);
    }
     else if(amt<30000)
    {
         Discount=0.2*amt;
        System.out.println("20% discount rate="+Discount);
         amt-=Discount;
        System.out.println("total amt="+amt);
    }
    else
    {
        Discount=0.3*amt;
        System.out.println("30% discount="+Discount);
         amt-=Discount;
        System.out.println("total amt="+amt);
    }
    
}
    
}