package Type_Casting;

public class typecasting_01 {
    public static void main(String[] args) {
        long phone = 9876543210l;
//        short s = phone; // Implicit Narrow?
        short s1 = (short)phone; // Explicit Narrow?
        System.out.println(s1);
    }
}
