/*4. Writea program that will give following output:
        Input: chattogram
        Output: C8M*/

package String_Manipulation;

import java.util.Locale;
import java.util.Scanner;

public class division_country {
    public static void main(String[] args) {
        System.out.println("Enter Division name : chattogram");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String firststr= String.valueOf(str.charAt(0)).toUpperCase();
        String laststr= String.valueOf(str.charAt(9)).toUpperCase();
        String len = String.valueOf(str.lastIndexOf('a'));
        String output = firststr+len+laststr;
        System.out.println(output);
    }
}
