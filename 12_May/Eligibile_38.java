//38. Accept age, weight, and haemoglobin level and check blood donation eligibility.

import java.util.Scanner;

class Eligibile_38
 {
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter age");
    int age=sc.nextInt();
    System.out.println("Enter weight");
    int weight=sc.nextInt();
    System.out.println("Enter haemoglobin level");
    int haemoglobin=sc.nextInt();

    
    if(age>=18 && age <=65 && weight>=50 && haemoglobin>=12.5)
    {
        System.out.println("eligible for blood donation");
    }
    else{
        System.out.println("not eligible for donation");
    }

}
 }