//37. Check whether a character is a special character.
import java.util.Scanner;

public class Special_37 
{
    public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter  character: "); 
       char ch=sc.next().charAt(0);
       if((Character.isAlphabetic(ch))||(Character.isDigit(ch)))
       {
         System.out.println("Character is alphabet/digit");
       }
       else
       {
        System.out.println("Character is special character");
       }
    }
    
}
