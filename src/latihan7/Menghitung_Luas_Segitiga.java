package latihan7;

import java.util.Scanner;

public class Menghitung_Luas_Segitiga {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, t;
        double luas;

        System.out.print("Masukan Nilai Alas : ");
        a=input.nextInt();
        System.out.print("Masukan  Nilai Tinggi : ");
        t=input.nextInt();

        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);

    }
}