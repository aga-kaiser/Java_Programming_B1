package day11_if_statements;

import java.util.Scanner;

/*
  ask a number from a user
  if number = between 1 and 10
        if it is even
        or odd
  else
        number is not in the range

 */
public class NestedExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = input.nextInt();

        if (number >= 1 && number <= 10) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }



    }

}