//34.	write a program to perform conversion of seconds to H:M:S


import java.util.*;
class prog34
{
    public static void main(String arg[])
    {
        int sec,hr,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter seconds");
        sec=sc.nextInt();
        hr=sec/3600;
        int rem=sec%3600;
        min=rem/60;
        sec=rem%60;
        System.out.println("hour="+hr);
        System.out.println("min="+min);
        System.out.println("sec="+sec);

        System.out.println(hr+":"+min+":"+sec);
    }
}
