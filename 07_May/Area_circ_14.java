//14. Write a program to find the area and circumference of a circle?

import java.util.*;
class Area_circ_14
{
    public static void main(String arg[])
    {
       float r;
        double area,circum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius:");
        r=sc.nextFloat();
        area=3.14 *r*r;
        circum=2*3.14f*r;
        System.out.println("Area of square="+area);
        System.out.println("perimeter of square="+circum);

    }
}

