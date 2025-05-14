//9. Check whether the first number is between the second and third.


import java.util.*;
class Betn_9
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number:");
    int n1=sc.nextInt();
     System.out.println("enter second number:");
    int n2=sc.nextInt();
     System.out.println("enter third number:");
    int n3=sc.nextInt();
    if(n1==n2 && n1==n3)
    {
        System.out.println("numbers are same");
    }
    else if((n1<n2 && n1>n3)||(n1>n2 && n1<n3))
    {
        System.out.println("first number is betn second and third");
    }
    else 
    {
        System.out.println("first number is not betn second and third");
            }
    }
}