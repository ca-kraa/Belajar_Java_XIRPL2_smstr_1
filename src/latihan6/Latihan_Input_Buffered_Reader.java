package latihan6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan_Input_Buffered_Reader {
    public static void main(String[] args)  throws IOException {
        String nama;
        // Membuat Objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat Objek BuffredReader
        BufferedReader br = new BufferedReader(isr);
        // Mengisi Variabek nama dengan BuffredReader
        System.out.print("Inputkan Nama : ");
        nama = br.readLine();
        // Tampilkan Output
        System.out.println("Nama Kamu Adalah : " + nama);

    }
}
