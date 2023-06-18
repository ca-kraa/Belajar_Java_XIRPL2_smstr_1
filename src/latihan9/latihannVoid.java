package latihan9;

import java.util.Scanner;

class data_siswa{
    int NIS;
    String nama, jurusan , sekolah;
    void input(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("DATA SISWA");
        System.out.println("------------");
        System.out.print("Masukkan NIS : ");
        NIS = keyboard.nextInt();
        System.out.print("Masukkan Nama : ");
        nama = keyboard.next();
        System.out.print("Masukkan Jurusan : ");
        jurusan = keyboard.next();
        System.out.print("Asal Sekolah :");
        sekolah = keyboard.next();
    }
    void output(){
        System.out.println("NIS :  "+NIS);
        System.out.println("Nama : "+nama);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Asal Sekolah :" +sekolah);
    }
}
public class latihannVoid {
    public static void main(String[] args) {
        data_siswa obj = new data_siswa();
        obj.input();
        obj.output();
    }
}
