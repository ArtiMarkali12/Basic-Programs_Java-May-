import java.util.*;
class Sw1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int n1=sc.nextInt();
         System.out.println("enter second number");
        int n2=sc.nextInt(); //n1=10 n2=20
        n1=n1+n2;           //n1=10+20=30
        n2=n1-n2;           //n2=30-20=10
        n1=n1-n2            //n1=30-10=20
        System.out.println("first number="+n1);  //n1=20 n2=10
        System.out.println("second number="+n2);
    }
}


