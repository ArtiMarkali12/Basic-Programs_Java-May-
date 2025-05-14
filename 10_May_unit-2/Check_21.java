//21. Check whether a number is 1-digit, 2-digit, 3-digit, 4-digit, or above.

import java.util.*;
class Check_21
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        if(num<0)
        {
            num=-num;
        }
       if(num>=0 && num<9)
        {
            System.out.println("1-digit number");
        }
         else if(num>10 && num<99)
        {
            System.out.println("2-digit number");
        }
         else if(num>100 && num<999)
        {
            System.out.println("3-digit number");
        }
         else if(num>1000 && num<9999)
        {
            System.out.println("4-digit number");
        }
        else
        {
            System.out.println("number is above 4-digit");
        }
    }
}