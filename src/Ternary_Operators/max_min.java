package Ternary_Operators;

import java.sql.SQLOutput;

public class max_min {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y)); as its Math.max() function
        //Using ternary operator

        int min = x < y ? x : y;
        System.out.println(min);

    }
}
