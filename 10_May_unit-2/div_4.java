//4. Check whether a number is divisible by 5 and 7.

import java.util.*;
class div_4
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number:");
    int n=sc.nextInt();
    if(n%5==0 && n%7==0)
    {
        System.out.println("number is divisible by  5 and 7");
    }
    else
    {
        System.out.println("number is not divisible by 5 and 7");
            }
    }
}