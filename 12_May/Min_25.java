import java.util.Scanner;

public class Min_25 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
         System.out.println("Enter b");
        int b=sc.nextInt();
         System.out.println("Enter c");
        int c=sc.nextInt();
        if(a<b)
        {
            if(a<c)
            {
                System.out.println("A is Min");
            }
            else{
                System.out.println("C is Min");
            }
        }else{
            if(b<c)
            {
                System.out.println("B is Min");
            }else{
                System.out.println("C is Min");
            }
        }

    }
    
}
