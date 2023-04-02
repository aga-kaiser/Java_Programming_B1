package day18_loops;
/*

 Given a String with three words separated by spaces. Reverse only the second word and return the modified String
     Ex:
     I love java

     Output:
     I evol java
  */

import java.util.Scanner;

public class ReverseMiddle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 word sentence: ");
        String str = input.nextLine();

        // I love java
        // 012345678910
        int firstSpace = str.indexOf(" ");   // 1
        int lastSpace = str.lastIndexOf(" ");   // 7

//        String middle = str.substring(firstSpace, lastSpace);  // _love
        String middle = str.substring(firstSpace + 1, lastSpace);  //  love
        String reverse = "";

        for (int i = middle.length()- 1; i >= 0; i--) {
            reverse += middle.charAt(i);

        }

        // I evol java
        // 012345678910
        System.out.println(str.substring(0, firstSpace) + " " + reverse + " " + str.substring(lastSpace +1));




    }

}
