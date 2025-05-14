//23. write a program to accept length breathe and height of room and accept length and height of
//doors and window to calculate total area to be printed (including roof also)
//2 * (length * width + length * height + width * height). 

import java.util.*;
class Demo_23
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of room");
        int l=sc.nextInt();
         System.out.println("Enter breadth of room");
        int b=sc.nextInt();
         System.out.println("Enter Height of room");
        int h=sc.nextInt();

        System.out.println("Enter length and height of doors");
        int l_door=sc.nextInt();
        int h_door=sc.nextInt();

        System.out.println("Enter length and height of window");
        int l_window=sc.nextInt();
        int h_window=sc.nextInt();

        int total_surface=2*(l+b)+2*(b+h)+2*(l+h);
        System.out.println("total area of room="+total_surface);

        int total_door=l_door*h_door;
        System.out.println("total area of door="+total_door);

        int total_window=l_window*h_window;
        System.out.println("total area of window="+total_window);

        int floor=l*b;
        System.out.println("total area of floor="+floor);
        int painted=total_surface-(total_door)-(total_window)-(floor);
        System.out.println("total area to be painted "+painted);



    }
}
