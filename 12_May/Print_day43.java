//43. Accept month number and print the number of days in that month

import java.util.Scanner;

public class Print_day43 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Jan");
        System.out.println("2.feb");
        System.out.println("3.March");
        System.out.println("4.April");
        System.out.println("5.May");
        System.out.println("6.June");
        System.out.println("7.july");
        System.out.println("8.August");
        System.out.println("9.sep");
        System.out.println("10.oct");
        System.out.println("11.Nov");
        System.out.println("12.Dec");

        System.out.println("Enter Your Choice :");
        int month=sc.nextInt();

        if(month==1 || month==3 || month==5 || month==7|| month==8|| month==10 || month==12)

        {
            System.out.println("Number of days in the month is 31");
        }else if(month==4 || month==6|| month==9)
        {
            System.out.println("number of days in the month 30");
        }else
        {
            System.out.println("number of days in the month is 28 or 29");
        }



    }
    
}
