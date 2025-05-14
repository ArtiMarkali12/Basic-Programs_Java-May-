//10. Check whether the third number is between the first and second.



import java.util.*;
class Betn_11
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
    else if((n3<n2 && n3>n1)||(n3>n2 && n3<n1))
    {
        System.out.println("third number is betn first and second");
    }
    else 
    {
        System.out.println("third number is not betn first and second");
            }
    }
}