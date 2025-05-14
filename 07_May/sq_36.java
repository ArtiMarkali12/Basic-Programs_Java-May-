//36. write a program to find the square root given number by using sqrt() function

import java.util.*;
class sq_36
{
    public static void main(String arg[])
    {
       double sq, num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextDouble();
        sq=Math.sqrt(num);
        System.out.println("Square root="+sq);
    }
}

        
