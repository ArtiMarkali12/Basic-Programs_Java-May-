/* 42. Accept product category and apply a discount based on category:
o Electronics → 10% discount
o Clothing → 15% discount, 20% if amount > ₹5000
o Food → No discount, but 5% if amount > ₹1000 */

import java.util.*;
public class Discount_42 {
    
    public static void main(String[] args) 
    {
         double disc;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Electronics ");
        System.out.println("2.clothing");
        System.out.println("3.Food");
        
        System.out.println("Enter your product category no. ");
        int category=sc.nextInt();
        System.out.println("enter amount :");
       double amt=sc.nextInt();

        if(category==1)
        {
       disc=0.1*amt;
        System.out.println("discount on Electronics Product="+disc);
        }else if(category==2)
        {
            if(amt>5000)
            {
                disc=amt*0.2;
                System.out.println("discount on clothing Product="+disc);
            }else{
                 disc=amt*0.15;
                System.out.println("discount on clothing Product="+disc);
            }
        }else if(category==3)
        {
             if(amt>1000)
            {
                disc=amt*0.05;
                System.out.println("discount on food Product="+disc);
            }else{
                System.out.println("No Discount");
            }
        }else
        {
            System.out.println("you entered invalid category number ");
        }
    }
}

        