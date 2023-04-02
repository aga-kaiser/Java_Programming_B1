package day21_arrays;

import java.util.Arrays;

/*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number
     */
public class StudentInformation {

    public static void main(String[] args) {

        String [] student1 = {"B001", "Tom", "Jerry", "B#1"};
        System.out.println("This is the info for Student 1: " + Arrays.toString(student1));

    }
}
