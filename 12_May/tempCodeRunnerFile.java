//31. Accept 10th, 12th, and graduation marks, then check eligibility for an interview.
import java.util.Scanner;

public class Check_31 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 th marks:");
        int m1=sc.nextInt();
         System.out.println("Enter 12 th marks:");
        int m2=sc.nextInt();
         System.out.println("Enter Graduation marks:");
        int m3=sc.nextInt();

        if(m1>=35 && m2>=35 && m3>=35)
        {
            System.out.println("Eligible for an interview");

        }else{
            System.out.println("Not eligible for interview");
        }
    }
}
