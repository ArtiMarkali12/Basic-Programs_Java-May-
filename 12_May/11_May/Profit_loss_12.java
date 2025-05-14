//12. Accept cost price and selling price, then find profit/loss in percentage/amount.

import java.util.*;
public class Profit_loss_12 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price:");
        double costPrice=sc.nextDouble();
        System.out.print("enter selling price");
        double sellingPrice=sc.nextDouble();

        double profitOrLoss=sellingPrice-costPrice;

        if(profitOrLoss>0)
        {
        System.out.println("profit:"+profitOrLoss+" RS.");
        System.out.println("profit%:"+(profitOrLoss/costPrice)*100);

    }
    else{
        System.out.println("Loss:"+(-profitOrLoss)+" Rs.");
        System.out.println("Loss:"+(-profitOrLoss/costPrice)*100);
    }
}
}