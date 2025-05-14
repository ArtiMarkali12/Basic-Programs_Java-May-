//17. Accept age and check whether a person is eligible for vot.


//3. Find whether a year is a leap year
import java.util.*;
class Voting
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter age:");
    int age=sc.nextInt();
    if(age>=18)
    {
        System.out.println("person is eligible for voting");
    }
    else
    {
        System.out.println("person is not eligible for voting");
            }
    }
}