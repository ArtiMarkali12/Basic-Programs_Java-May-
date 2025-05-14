/* 1. Accept weekday/weekend & age, then calculate movie ticket pricing:
o Children (<13 years) → ₹100 (Weekdays), ₹120 (Weekends)
o Adults (13-64 years) → ₹150 (Weekdays), ₹180 (Weekends)
o Seniors (≥65 years) → ₹130 (Weekdays), ₹150 (Weekends) */

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Weekday_41
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Monday ");
        System.out.println("2.Tuesday");
        System.out.println("3.wednesday");
        System.out.println("4.Thursday");
        System.out.println("5.Friday");
        System.out.println(" 6.Saturday");
        System.out.println("  7.Sunday");
        System.out.println("Enter your choice ");
        int day=sc.nextInt();

        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        
        if(day>=1 && day<=5)
        {
          System.out.println("Weekday");  
          if(age<=13)
          {
            System.out.println("Your tcket Price 100 Rs.");
          }else if(age>13 && age <=65)
          {
            System.out.println("Your ticket price 150 Rs ");
          }else
          {
            System.out.println("Your ticket price 130 Rs");
          }
        }else
        {
            System.out.println("Weekday");
            if(age<=13)
          {
            System.out.println("Your tcket Price 120 Rs.");
          }else if(age>13 && age <=65)
          {
            System.out.println("Your ticket price 180 Rs ");
          }else
          {
            System.out.println("Your ticket price 150 Rs");
          }
        }

       

    }
}