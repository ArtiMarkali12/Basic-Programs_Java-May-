import java.util.*;
class mean
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        double a=sc.nextDouble();
        System.out.println("enter b");
        double b=sc.nextDouble();
        
        double am=(a+b)/2;
        double hm=(a-b)/2;

        System.out.println("Arithmetic mean="+am);
        System.out.println("Harmonic mean="+hm);
        }
}