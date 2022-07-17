/*5. Write a program that will count how many vowels in the given string:
        "roadtosdet"
        Output: 4*/
package String_Manipulation;

import java.util.Scanner;

public class count_how_many_vowels {
    public static void main(String[] args) {
        System.out.println("Enter your string to find number of vowel");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int vowelvalue = 0;
        int consonentvalue = 0;
        for (int i = 0; i < string.length(); i++) {
            char charecter = string.charAt(i);
            if (charecter == 'a' || charecter == 'e' || charecter == 'i' ||
                    charecter == 'o' || charecter == 'u' || charecter == 'A'
                    || charecter == 'E' || charecter == 'I' || charecter == 'O' || charecter == 'U') {
                vowelvalue++;
            } else if (charecter >= 'a' && charecter <= 'z') {
                //Increments the consonant counter
                consonentvalue++;

            }
            }
        System.out.println("Vowel = " + vowelvalue);
        System.out.println("Consonent= " + consonentvalue);

    }
}
