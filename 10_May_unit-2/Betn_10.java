//10. Check whether the second number is between the first and third.



import java.util.*;
class Betn_10
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
    else if((n2<n1 && n2>n3)||(n2>n1 && n2<n3))
    {
        System.out.println("second number is betn first and third");
    }
    else 
    {
        System.out.println("second number is not betn first and third");
            }
    }
}