import java.util.*;
class Sqrt
{
    public static void main(String arg[])
    {
         double x1,x2,y1,y2,dist;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance of x1,y1");
        x1=sc.nextDouble();
        y1=sc.nextDouble();

        System.out.println("Enter the distance of x2, y2");
        x2=sc.nextDouble();
        y2=sc.nextDouble();

        dist=Math.sqrt((x2-x1)+(y2-y1));
        System.out.println("Distance between two points="+dist);

    }
}
