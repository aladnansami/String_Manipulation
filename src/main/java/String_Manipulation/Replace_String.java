/*6. Replace "R" from Rahim with "F" from the given String:
        Input: Ratul and Rahim lives in Rangpur
        Output: Ratul and Fahim lives in Rangpur*/

package String_Manipulation;

import java.util.Scanner;

public class Replace_String {
    public static void main(String[] args) {
        System.out.println("Enter your String to replace Rahim to Fahim");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String fin = string.replace("Rahim","Fahim");
        System.out.println(fin);
    }
}

