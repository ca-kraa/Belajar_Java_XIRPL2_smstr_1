package polimorfisme;

public class Cetak {
    static double maxNumber(double a, double b){
        if ( a < b ){
            return a;
        }
        else {
            return b;
        }
    }
    static int maxNumber(int a, int b){
        if ( a < b ){
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(5.5, 7.5));
        System.out.println(maxNumber(10,20));
    }
}
