//30. Accept three subject marks from the user and display total,
// percentage, and class.

import java.util.Scanner;

public class Disp_30
 {
   public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three subject marks:");
    double s1=sc.nextDouble();
    double s2=sc.nextDouble();
    double s3=sc.nextDouble();

    double t=s1+s2+s3;
    double p=t/3;
    System.out.println("Percentage %:"+p);

    if(p>80 && p<=100)
    {
        System.out.println("Distinction class");
    }else if(p>70 && p<=80)
    {
        System.out.println("first class");
    }else if(p>55 && p<=70)
    {
        System.out.println("Second class");
    }else if(p>35 && p<=55)
    {
        System.out.println("pass");
    }else
    {
        System.out.println("Fail");
    }
   } 
}
