//. Accept basic salary and calculate tax based on given tax brackets.

import java.util.Scanner;
public class Tax_14 {
    
    public static void main(String[] args) 
    {
        double tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        double sal=sc.nextDouble();
        if(sal<=300000)
        {
            System.out.println("No Tax(Nil)");
        }
        else if (sal>300000 && sal<=500000)
         {
            tax=sal*0.05;
            System.out.println("5% tax on "+sal+" = "+tax);

        }
         else if (sal>500000 && sal<=1000000)
         {
            tax=10000+(0.2*sal);
            System.out.println("10000 + 20% tax on "+sal+" = "+tax);
            
        }
         else 
         {
            tax=110000+(0.3*sal);
            System.out.println("1,10,000 + 30% tax on "+sal+" = "+tax);
            
        }

    }
    
}
