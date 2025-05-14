//19. Accept number of vaccines taken, if 2 vaccines then print eligible for interview

import java.util.*;
class Vaccine_19
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vaccine taken(1/2)");
        int n=sc.nextInt();
        if(n==2)
        {
            System.out.println("person is eligible for interview");
        }
        else
        {
            System.out.println("person is not eligible for interview");
        }
    }
}