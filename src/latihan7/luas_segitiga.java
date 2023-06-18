package latihan7;

import javax.swing.*;

public class luas_segitiga {
    public static void main(String[] args) {
        String judul = "MENGHITUNG LUAS SEGITIGA !";
        JOptionPane.showMessageDialog(null, judul);
       String alas = "";
       alas = JOptionPane.showInputDialog("Masukkan Alas !");
       int a = Integer.parseInt(alas);
       String tinggi = "";
       tinggi = JOptionPane.showInputDialog("Masukkan Tinggi !");
       int t = Integer.parseInt(tinggi);
        String luas = "luas segitiga adalah " + (0.5*a*t);
        JOptionPane.showMessageDialog(null, luas);

    }
}
