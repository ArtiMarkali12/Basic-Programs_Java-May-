//38. The temperature of the city is input through the keyboard in Fahrenheit. Write a program to
//convert into Celsius?
import java.util.*;
class Celsius_38
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tempreatur in fahrenheit:");
        double f=sc.nextDouble();

        double c=(f-32)*5/9;
        System.out.println("fahrenheit into celsius "+c);

    }
}