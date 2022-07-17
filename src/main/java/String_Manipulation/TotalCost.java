
/*
2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk.
If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
After your purchase what will be your total cost?
*/

package String_Manipulation;

import java.util.Scanner;

public class TotalCost {
    public static void main(String[] args) {
        int formalShirt;
        int shirtPrice = 1200;
        int sharee;
        int shareePrice= 3500;
        int discountPrice= 400;

        System.out.println("shirtPrice = 1200");
        System.out.println("shareePrice= 3500");
        System.out.println("if you buy two shirt and one sharee you will get 400 tk discount");
        System.out.println("Enter Your Amount of shirt");
        Scanner scanner= new Scanner(System.in);
        formalShirt=scanner.nextInt();
        System.out.println("Enter Your Amount of shirt");
        Scanner scanner2= new Scanner(System.in);
        sharee=scanner.nextInt();

        int Total = formalShirt*shirtPrice + sharee*shareePrice;
        if (formalShirt==2 & sharee==1){
            int TotalDiscount = Total-discountPrice;
            System.out.println("Price after Discount " + TotalDiscount);
        }
        else {
            System.out.println("Price Without Discount "+Total);
        }
    scanner.close();
        scanner2.close();
    }

}
