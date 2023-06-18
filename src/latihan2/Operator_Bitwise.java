package latihan2;

public class Operator_Bitwise {
    public static void main(String[] args) {
        int a = 62; /* 62 = 0011 1110 */
        int b = 11; /* 11 = 0000 1011 */
        int c = 0;
        String biner;
        System.out.println("Nilai a = " + a + " = " +
        Integer.toBinaryString(a));
        System.out.println("Nilai b = " + b + " = " +
                Integer.toBinaryString(b));

        // Operasi AND
        c = a & b; /* 10 = 0000 1010 */
        biner = Integer.toBinaryString(c);
        System.out.println("a & b = " + c + " = " + biner);

        // Operasi OR
        c = a | b;
        biner = Integer.toBinaryString(c);
        System.out.println("a | b = " + c + " = " + biner);

        // Operasi XOR
        c = a ^ b; /* 10 = 0000 1010 */
        biner = Integer.toBinaryString(c);
        System.out.println("a ^ b = " + c + " = " + biner);
    }
}
