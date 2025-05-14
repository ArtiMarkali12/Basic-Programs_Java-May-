//32. write a program to perform conversion of metres to kilometres


import java.util.*;
class conv_32
{
    public static void main(String arg[])
    {
        int m,km;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter distance in meters ");
        m=sc.nextInt();
        km=m/1000;
        m=m%1000;

        System.out.println(km+" kilometers "+m+" meters ");
    }
}