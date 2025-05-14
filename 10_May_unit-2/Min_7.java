//7. Find the minimum of two numbers.

import java.util.*;
class Min_7
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number:");
    int a=sc.nextInt();
    System.out.println("enter second number:");
    int b=sc.nextInt();
    if(a<b)
    {
        System.out.println(" first number is minimum");
    }
    else
    {
        System.out.println("second number is minimum");
            }
    }
}