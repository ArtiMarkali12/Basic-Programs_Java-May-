//4. Check whether a number is divisible by 5 and 7.

import java.util.*;
class Pos_8
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number:");
    int n=sc.nextInt();
    if(n==0)
    {
        System.out.println("number is zero");
    }
    else if(n>0)
    {
        System.out.println("number is positive");
            }
            else{
                System.out.println("number is negative");
            }
    }
}