//29. write a program to perform conversion of kilometres to metres

import java.util.*;
class kilo_29
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance in kilometers:");
        double kilometers=sc.nextDouble();
        double meters=kilometers*1000;
        System.out.println("Distance in meters="+meters);
    }
}