import java.util.Scanner;

public class Char 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); //accepting character from user
        int asciiValue = (int) ch;

       
        System.out.printf("The ASCII value of '%c' is: %d%n", ch, asciiValue);

        
    }
}
