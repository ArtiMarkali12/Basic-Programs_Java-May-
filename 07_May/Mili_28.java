//28. write a program to perform conversion of litres to millilitres
import java.util.*;
class Mili_28
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter volume in liters:");
        double liters=sc.nextDouble();
        double M_liters=liters*1000;
        System.out.println("Volume in milliliters="+M_liters);
    }
}