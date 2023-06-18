package latihan6;


import java.util.Scanner;

public class class_scanner {
    public static void main(String[] args) {
        String nama, alamat;
        int usia;
        Scanner input = new Scanner(System.in);
        System.out.println("+------------+");
        System.out.println("| Data Siswa |");
        System.out.println("+------------+");
        System.out.print("Masukkan Nama Anda :");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat Anda :");
        alamat = input.nextLine();
        System.out.print("Masukkan Usia Anda :");
        usia = input.nextInt();
        //Tampilkan Data

        System.out.println("Nama Anda = " +nama);
        System.out.println("Alamat Anda = " +alamat);
        System.out.println("Usia Anda = " +usia);
    }
}
