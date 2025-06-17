package Ternary_Operators;

public class max_no {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 10;
        int n3 = 20;

        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1  > n3 -> n1
        // n2 > n3 and n2>  n1 ->  n2
        // n3

        // Step 3
        //int max = (n1> n2) ? A : B;
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        // A -> (n1 > n3) ? n1 : n3
        // B -> ( n2> n3) ? n2 : n3
        System.out.println(max);
    }
}
