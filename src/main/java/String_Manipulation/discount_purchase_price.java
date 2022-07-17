/*
3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
*/


package String_Manipulation;

import java.util.Scanner;

public class discount_purchase_price {
    public static void main(String[] args) {
        int laptopPrice = 76000;
        double case_payment_discount = 0.10;
        System.out.println("Core i 7 HP laptop Price = 76000");
        System.out.println("If you pay cash payment than you will get 10% off");

        System.out.println("Enter 1 for Case Payment or click 2 for online");
        Scanner input= new Scanner(System.in);
        int purchase = input.nextInt();
        if (purchase==1)
        {
            double case_payment_with_discount = laptopPrice*case_payment_discount;
            double purchasePrice = laptopPrice-case_payment_with_discount;
             System.out.println("Dicsount Price "+case_payment_with_discount+" Purchase Price = "+purchasePrice );
        }
        else if (purchase==2)
        {
            System.out.println("Purchase Price" +laptopPrice);
        }
        else
            System.out.println("Enter Valid Payment Method");

    }
}
