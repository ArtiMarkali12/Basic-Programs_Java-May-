//41. The distance between two cities in Km. is input through the keyboard. Write a program to
//convert and print the result in meters and centimetres?
import java.util.*;
class Dist41
{
    public static void main(String arg[])
    {
        double dist, dist_meters,dist_centi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance between two cities in kilometers");
        dist=sc.nextDouble();
        dist_meters=dist*1000;
        dist_centi=dist*100000;
        System.out.println("distance between two cities in meters="+dist_meters);
        System.out.println("distance between two cities in centimeters="+dist_centi);
    }
}
