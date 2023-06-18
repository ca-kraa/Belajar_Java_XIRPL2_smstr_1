package latihan2;

public class Operator_Logika {
    public static void main(String[] args) {
        int A = 75;
        int B = 85;
        int C = 90;
        boolean a = A > B && B < C;
        boolean b = A < B && B < C;
        boolean c = A > B || B < C;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
