import java.util.Scanner;

public class Check_digit_36 
{
    public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter character:"); 
       char ch=sc.next().charAt(0);
       if(Character.isDigit(ch))
       {
        System.out.println("Character is  Digit");
       }else{
        System.out.println("Character is not digit");
       }
    }
    
}
