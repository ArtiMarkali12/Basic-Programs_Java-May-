import java.util.Scanner;
public class Commision_15 
{   public static void main(String[] args)
     {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Monthly sales income:");
     double salesIncome=sc.nextDouble();
        double commission_Rate;
     if(salesIncome<50000)
     {
        commission_Rate=0.02;
     }
     else if(salesIncome>=50000 && salesIncome<=100000)
     {
        commission_Rate=0.05;
     }
     else if(salesIncome>100000 && salesIncome<=200000)
     {
        commission_Rate=0.07;
     }
     else
     {
        commission_Rate=0.1;
     }
     double commission=salesIncome*commission_Rate;
     System.out.println("Commission= "+commission);
    } 
}
