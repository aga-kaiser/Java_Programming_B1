package day16_loops;

public class MethodChaining {

    public static void main(String[] args) {

        String word = "     Java is a great language       ";
        System.out.println(word);

        word = word.trim();     // "Java is a great language"
                                //  0123456.........
        System.out.println(word);


//        word = word.substring(0, 4);
        word = word.substring(0, word.indexOf(" "));
        System.out.println(word);


        System.out.println("--------------------------");
        word = "     Java is a great language       ";
        System.out.println(word);

        //TODO:Debug
        //String word2 = word.trim().substring(0, 4).toLowerCase().toUpperCase().contains("ja");  // not valid
        //String word3 = contains("ja").word.trim().substring(0, 4).toLowerCase().toUpperCase();  // Not valid
        String word4 = word.indexOf(1) + "Hello";  // Concatenation
//        String word5 = word.indexOf(1).substring(0, 4);  // chaining
        String word6 = word.trim().substring(0, 4).toLowerCase().toUpperCase();

        System.out.println(word6);

    }
}
