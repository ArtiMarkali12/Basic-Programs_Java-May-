//40. Rajesh’s basic salary is input through the keyboard. His D.A. is 40% of basic salary, and H.R.A. is
//20% of basic salary. Write a program to calculate his gross sal?

import java.util.*;
class Gross_sal_40
{
    public static void main(String arg[])
    {
        double sal,gross_sal,DA,HRA;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic sal");
        sal=sc.nextDouble();
        DA=0.40*sal;
        HRA=0.20*sal;
        gross_sal=sal+DA+HRA;
        System.out.println("DA="+DA);
        System.out.println("HRA="+HRA);
        System.out.println("gross sal="+gross_sal);

    }
}