package day24_office_hours;

/*
 This method made by Loopcamp Batch#1
 The method accepts a String and returns the reversed String
 */
public class StringUtil {

    public static String reverseStr (String str) {

        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


}