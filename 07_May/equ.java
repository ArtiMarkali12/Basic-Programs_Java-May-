//write a java program ti multiply and divide two numbers and print them in the form of equation (4*3=12 8/4=2)?
import java.util.*;
class equ
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println("enter number 2");
        int b=sc.nextInt();
        System.out.println("enter number 3");
        int c=sc.nextInt();
        System.out.println("enter number 4");
        int d=sc.nextInt();
        System.out.println(a+"*"+b+"="+(a*b));
         System.out.println(c+"/"+d+"="+(double)(c/d));

    }
}