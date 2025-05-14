
//3. Find whether a year is a leap year
import java.util.*;
class Leap
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter year:");
    int year=sc.nextInt();
    if(year%4==0)
    {
        System.out.println("it is leap year");
    }
    else
    {
        System.out.println("not leap year");
            }
    }
}