//15. Write a program to find the volume of a cylinder?
import java.util.*;
class Volume_16
{

 public static void main(String arg[])
    {
      double r,h;
        double volume;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius:");
        r=sc.nextDouble();
          System.out.println("enter height:");
        h=sc.nextDouble();
        volume=3.14*r*r*h;
       
        System.out.println("volume of cylinder="+volume);
      
    }
}