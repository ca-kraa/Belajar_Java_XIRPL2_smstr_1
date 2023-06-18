package latihan6;

import javax.swing.*;

public class Latihan_JOptionPane {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
        String pesan = "Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, pesan);

    }
}
