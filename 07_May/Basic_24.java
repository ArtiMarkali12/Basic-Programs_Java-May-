//24. write a program to accept basic salary from user and calculate HRA, TA and DA and calculate
//gross salary
import java.util.*;
class Basic_24
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic salary");
        double sal=sc.nextDouble();
        double hra=0.15*sal;
        System.out.println("HRA="+hra);
        double TA=0.2*sal;
         System.out.println("TA="+TA);
         double DA=0.25*sal;
          System.out.println("DA="+DA);
          double gs=sal+hra+TA+DA;
           System.out.println("gs="+gs);
        
    }
}