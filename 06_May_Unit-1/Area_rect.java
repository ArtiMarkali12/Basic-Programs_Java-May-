import java.util.*;
class Area_rect
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        double l=sc.nextDouble();
         System.out.println("enter breadth");
        double b=sc.nextDouble();

        double Area_rect=l*b;
        System.out.println("Area of rectangle="+Area_rect);

    }
}