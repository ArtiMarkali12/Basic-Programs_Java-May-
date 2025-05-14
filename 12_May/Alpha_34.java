//34. Check whether a character is an alphabet or not.

import java.util.Scanner;
class Alpha_34
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character:");
        char ch=sc.next().charAt(0);
        if(Character.isAlphabetic(ch))
        {
            System.out.println("Character is alphabet");
        }else
        {
            System.out.println("character is not alphabet");
        }

    }
}