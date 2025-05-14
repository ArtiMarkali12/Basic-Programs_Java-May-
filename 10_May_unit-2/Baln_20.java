//20. Accept ATM balance and withdrawal amount, then check sufficient balance and display the
//remaining balance.

import java.util.*;
class Baln_20
{
        public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter ATM balance");
           long bal=sc.nextInt();
            System.out.println("enter withdraw amount");
           long amt=sc.nextInt();

           
             if(amt<=bal)
           {
            bal-=amt;;
            System.out.println("withdraw successfully your remaining balance="+bal);
           }
           else{
            System.out.println("insufficient balace your balance is "+bal);
           }
           
        }
}