import java.util.Scanner;

public class EMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter loan amount");
        double loan=sc.nextDouble();
        
        System.out.println("Enter Duration :");
        int duration=sc.nextInt();

        double interest=loan*0.1;
        double EMI=(loan+interest)/duration;
        
        System.out.println("Interest:"+interest+" Rs.");
        System.out.println("EMI: "+EMI+" Rs.");
    }
    
}
