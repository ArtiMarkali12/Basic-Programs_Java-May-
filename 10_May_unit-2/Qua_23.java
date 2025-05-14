
import java.util.*;
class Qua_23
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();

         if(x>0 && y>0)
        {
            System.out.println("point in the first quadrant ");
        }
         else if(x<0 && y>0)
        {
            System.out.println("point in the second quadrant ");
        }
         else if(x<0 && y<0)
        {
            System.out.println("point in the third quadrant ");
        }
         else if(x>0 && y<0)
        {
            System.out.println("point in the fourth quadrant ");
        }

          else if(x>0 && y==0)
        {
            System.out.println("point on the positive x-axis ");
        }
          else if(x<0 && y==0)
        {
            System.out.println("points on the negative  x-axis ");
        }


          else if(x==0 && y>0)
        {
            System.out.println("point on the positive y-axis ");
        }
          else if(x==0 && y<0)
        {
            System.out.println("points on the negative  y-axis ");
        }
        else
        {
            System.out.println("points on the origin ");
        }
    }
}