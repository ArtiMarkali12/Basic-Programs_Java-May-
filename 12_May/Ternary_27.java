//27. Find the maximum of two numbers using the ternary operator

import java.util.Scanner;

public class Ternary_27
 {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a:");
       int a=sc.nextInt();
       System.out.println("Enter b:");
       int b=sc.nextInt();
       
       int max=(a>b)? a:b;
       System.out.println("Max element is:"+max);
    }
}
