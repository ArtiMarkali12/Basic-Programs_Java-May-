//39. Write a program that calculates the movie ticket price based on age (children under 12 get
// a discount, seniors over 65 also get a discount).

import java.util.Scanner;

public class Movie_ticket_39
 {
    public static void main(String[] args)
     {
        int  discount_price=150;
        int base_price=200;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Age:");  
      int age=sc.nextInt();
       if(age<12 || age >=65)
       {
        System.out.println("discount price :"+discount_price);
       }else{
        System.out.println("base price "+base_price);
       }
        

    }
}
