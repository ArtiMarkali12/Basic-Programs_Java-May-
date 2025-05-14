//18. Accept ATM pin number (1234) and check whether it is valid or not
import java.util.*;
class ATM_18
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ATM pin");
        int num=sc.nextInt();
        if(num==1234)
        {
            System.out.println("ATM pin number is valid");
        }
        else{
            System.out.println("ATM pin number NOT is valid"); 
        }
    }
}