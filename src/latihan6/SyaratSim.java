package latihan6;

// Tugas Nabil Mufti

import java.util.Scanner;

public class SyaratSim {
    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner input = new Scanner(System.in);
        System.out.println("*|----------------|*");
        System.out.println("*|   Membuat SIM  |*");
        System.out.println("*|----------------|*");
        System.out.print("Masukkan Nama Anda = ");
        nama = input.nextLine();
        System.out.print("Masuukan Umur Anda = ");
        umur = input.nextInt();

        if (umur >17) {
            System.out.println(nama + ", Anda Berhak Membuat SIM, Selamat "+ nama);
        }
        else {
            System.out.println(nama + " , Anda Belum Berhak Membuat SIM Karena Umur Anda Masih " + umur +" Terimakasih" );
        }
    }
}
