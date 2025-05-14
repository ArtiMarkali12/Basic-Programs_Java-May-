//34. write a program to find remainder and quotient by accepting divisor and dividend
import java.util.*;
class div_34
{
    public static void main(String arg[])
    {
       int divisor,dividend,quo,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter divisor"); //divisor=9 dividend=75
        divisor=sc.nextInt();
        System.out.println("enter dividend");
        dividend=sc.nextInt();
        
        quo=dividend/divisor;   // 75/9=8
        rem=dividend%divisor;   // 75%9=3

        System.out.println("quotient="+quo);
        System.out.println("reaminder="+rem);
    }
}
