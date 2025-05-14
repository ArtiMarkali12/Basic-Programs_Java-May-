import java.util.Scanner;

public class Max_four_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        System.out.println("Enter d");
        int d = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All are equal");
        } else {
            if (a > b && a > c && a > d) {
                System.out.println("A is Max");
            } else if (b > a && b > c && b > d) {
                System.out.println("B is Max");
            } else if (c > a && c > b && c > d) {
                System.out.println("c is Max");
            } else {
                System.out.println("D is Max");
            }
        }

    }

}
