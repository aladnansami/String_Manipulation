
/*
8. Write a program to convert each 1st char to uppercase from a string
        Input: rahim lives in sylhet
        Output: Rahim Lives in Sylhet*/
package String_Manipulation;

import java.util.Scanner;

public class Capitalize_First_Charecter {
   /* public static void main(String[] args) {
        System.out.println("Enter your test = ");
        Scanner scanner=new Scanner(System.in);
        String message = scanner.nextLine();
        String output = string.substring(0,1);
        System.out.println(output);
    }

    class Main {*/
   public static void main(String[] args)  {

            System.out.println("Enter your test = ");
            Scanner scanner=new Scanner(System.in);
            String message = scanner.nextLine();
            // create a string
         /*   String message = "everyone loves java";*/

            // stores each characters to a char array
            char[] charArray = message.toCharArray();
            boolean foundSpace = true;

            for(int i = 0; i < charArray.length; i++) {

                // if the array element is a letter
                if(Character.isLetter(charArray[i])) {

                    // check space is present before the letter
                    if(foundSpace) {

                        // change the letter into uppercase
                        charArray[i] = Character.toUpperCase(charArray[i]);
                        foundSpace = false;
                    }
                }

                else {
                    // if the new character is not character
                    foundSpace = true;
                }
            }

            // convert the char array to the string
            message = String.valueOf(charArray);
            System.out.println("Message: " + message);
        }
    }
