//32. Accept marks in three subjects, if marks in each subject ≥ 40, then display class, else print
//fail/ATKT

import java.util.Scanner;

public class Print_32 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of python:");
        double python=sc.nextDouble();
         System.out.println("Enter Marks of java:");
        double java=sc.nextDouble();
         System.out.println("Enter Marks of DSA:");
        double DSA=sc.nextDouble();

        if(python>=40 && java>=40 && DSA>=40)
        {
            double total=python+java+DSA;
            double p=total/3;
            System.out.println("percentage ="+p);

            if(p>90 && p<=100)
            {
                System.out.println("Distinction class");
            }
            else  if(p>80 && p<=90)
            {
                System.out.println("First class");
            }
             else  if(p>70 && p<=80)
            {
                System.out.println("second class");
            }
             else  if(p>40 && p<=70)
            {
                System.out.println("pass class");
            }
        }
        else
        {
            System.out.println("Sorry!! You are get Failed");

        }
     }

    }
