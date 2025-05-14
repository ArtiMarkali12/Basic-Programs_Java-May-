//24. Find the maximum of three numbers using nested if-else.
import java.util.Scanner;

class Max_24
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
         System.out.print("Enter b:");
        int b=sc.nextInt();
         System.out.print("Enter c:");
        int c=sc.nextInt();
          System.out.print("Enter d:");
        int d=sc.nextInt();

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
         System.out.println("d:"+d);
        

        if(a>b)
        {
            if(a>c)
            {
                
                System.out.println("A is Max");
            }else
            {
                System.out.println("C is Max");
            }
        }else
        {
            if(b>c)
            {
                System.out.println("B is Max");
            }else
            {
                System.out.println("C is Max");
            }
        }

    }
}