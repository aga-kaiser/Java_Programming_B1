package day04_variables;

public class PrimitiveDataTypes {

    public static void main (String [] args) {

        byte age = 55;

        System.out.println("60"); //hard coded
        System.out.println(age);   //dynamic




        byte ageTwo = 70;
        System.out.println(ageTwo);

        age = 40;
        System.out.println(age);

        byte age2 = 80;
        System.out.println("age2");
        System.out.println(age2);

        age2 = age;
        System.out.println(age2);

        age2 = 55;

        byte age3 = age2;
        System.out.println(age3);



        // byte number = 200;  // 200 is too big for byte type

        short year; // declare a variable called year nad it's data type is short
        year = 2023; // assigning 2023 to a variable called year


        // declare a variable called addressNumber abd data type is int - assign value of 244999944
        int addressNumber = 244999944 ;

        //long bigNumber = 18784576880087 --> this value is int by default it is too big and we need to assign it to long data type.
        long bigNumber = 18784576880087L; // we can add L at the end of the value






    }
}
