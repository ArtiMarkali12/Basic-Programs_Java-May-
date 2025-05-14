//37. A milk vendor buys milk at the rate of 3.25/- the then adds a litre of water for every four litres of
//milk and sells the water milk at the rate of 4.15/1t. calculate the gain for milk vendor?
import java.util.*;
public class Prog_37 {

    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the liter of milk:");
        double milk=sc.nextDouble();

        double water=milk/4;
        double total=milk+water;

        double cost_price=milk*3.25;
        double selling_price=total*4.15;

        double gain=selling_price-cost_price;
        System.out.println("the gain for milk vendor "+gain);
    }
}