package day13_string;

public class StringMethods {

    public static void main(String[] args) {

        String name = "James";

        // how to compare 2 strings --- > we used .equals();
        System.out.println(name.equals("James")); // true

        System.out.println("cat".equals("dog"));  // false

        System.out.println(name.equals("james")); // false

        //  how to compare 2 strings ignoring case sensitiveness
        System.out.println(name.equalsIgnoreCase("JAMES")); //








    }
}
