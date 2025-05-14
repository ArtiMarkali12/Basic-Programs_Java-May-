//6. Find the maximum of two numbers.

import java.util.*;
class Max_6
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number:");
    int a=sc.nextInt();
    System.out.println("enter second number:");
    int b=sc.nextInt();
    if(a>b)
    {
        System.out.println(" first number is max");
    }
    else if(a<b)
    {
        System.out.println("second number is max");
            }
            else
            {
                System.out.println("numbers are equal");
            }
    }
}