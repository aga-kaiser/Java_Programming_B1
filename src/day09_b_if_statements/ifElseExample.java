package day09_b_if_statements;

public class ifElseExample {

    public static void main(String[] args) {

        int result = 67;
        int passRate = 65;

        // 65 and higher passing
        if (result>=passRate){
            System.out.println("Passed java quiz. Feyruz is happy. ");
        }else{
            System.out.println("Feyruz is crying ");
        }

    }
}