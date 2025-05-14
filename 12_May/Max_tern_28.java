//28. Find the maximum of three numbers using the ternary operator.

    import java.util.Scanner;
public class Max_tern_28 {
    

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a:");
       int a=sc.nextInt();
       System.out.println("Enter b:");
       int b=sc.nextInt();
       System.out.println("Enter c:");
       int c=sc.nextInt();

       int max=(a>b)? (a>c)? a:c : (b>c)? b:c;
       System.out.println("Max element is "+max);
    } 
}
