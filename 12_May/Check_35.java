//35. Check whether a character is uppercase, lowercase, or something else.

import java.util.Scanner;

public class Check_35 
{
    public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter your character:");
       char ch=sc.next().charAt(0);  

       if(Character.isUpperCase(ch))
       {
        System.out.println("character is uppercase");
       }else if(Character.isLowerCase(ch))
       {
        System.out.println("character is lowercase");
       }else if(Character.isDigit(ch))
       {
        System.out.println("character is digit");
       }
       else
       {
        System.out.println("character is special character ");
       }
      }
}
