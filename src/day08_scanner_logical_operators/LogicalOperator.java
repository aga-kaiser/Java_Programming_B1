package day08_scanner_logical_operators;

public class LogicalOperator {

    public static void main(String[] args) {

        int num = 20;

        System.out.println(num > 5);  // true
        System.out.println(num < 10);  // true

        System.out.println(num > 5 && num > 10); // true
        //                  true  && true

        System.out.println(num < 5 && num > 10); // false
        //                 false  &&  true

        int i = 5;
        int y = 10;

        System.out.println(y > 9 && i++ > 2 ); // true
        //                 true

        System.out.println(y > 9 && i > 2 ); // true

        int x = 20;
        int w = 30;

        System.out.println(x > 5 || w++ > 20); // true
        //                true       not executed

        System.out.println(w);



    }



}
