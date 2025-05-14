//22. Read three sides (a, b, c) of a triangle and print its type.
import java.util.*;
class Tri_22
{
    public static void main(String arg[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter three sides of triangle a,b,c");
        double a=sc.nextDouble();
         double b=sc.nextDouble();
          double c=sc.nextDouble();
            if(a<0 || b<0 || c<0)
            {
                System.out.println("triangle sides must be positive");
            }
           else if (((a * a) + (b * b) == c * c) || ((b * b) + (c * c) == a * a) || ((a * a) + (c * c) == b * b))
          {
            System.out.println("It is Right angled Triangle");
          }
          else if((a==b)&&(b==c))
          {
            System.out.println("Equilateral Triangle");
          }
          else if((a==b)||(b==c)||(c==a))
          {
            System.out.println("IsoScalene triangle");
          }
          else  if (a != b && b != c && a != c) 
          {
            System.out.println("Scalene triangle");
          }
          else{
            System.out.println("sides  do not form a triangle");
          }

    }
}