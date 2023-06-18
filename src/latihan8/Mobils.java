package latihan8;

public class Mobils {
    // Variabel Static
    static String warna = "Biru";
    static int tahunProduksi = 2018;
    // Method Static
    static void ubah(){
        warna = "Merah";
    }
    static void tampil(){
        System.out.println(warna);
        System.out.println(tahunProduksi);
    }

    public static void main(String[] args) {
        // Pemanggilan Method Static
        Mobils.ubah();
        Mobils.tampil();
    }
}
