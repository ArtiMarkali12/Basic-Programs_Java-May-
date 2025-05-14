//45. write a program to find the surface area of cylinder
import java.util.*;
class Surface_45
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius :");
        double r=sc.nextDouble();
         System.out.println("enter Height :");
        double h=sc.nextDouble();

        double vol=(2*3.14*r*r)+(2*3.14*r*h);
        System.out.println("vloume of cylinder="+vol);
    }
}
