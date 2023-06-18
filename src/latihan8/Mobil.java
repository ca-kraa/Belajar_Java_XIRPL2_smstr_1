package latihan8;

public class Mobil {
    String warna;
    int tahunProduksi;
    int nomorMesin;
    int nomorRangka;

    public static void main(String[] args) {
        Mobil Mobilniaga = new Mobil ();
        // Mengisi variabel instance
        Mobilniaga.warna = "Merah";
        Mobilniaga.tahunProduksi = 2018;
        Mobilniaga.nomorMesin = 122233;
        Mobilniaga.nomorRangka = 224556;
        // Menampilkan isi Variabel instance
        System.out.println("Warna : " + Mobilniaga.warna);
        System.out.println("Tahun Produksi : " + Mobilniaga.tahunProduksi);
        System.out.println("Nomor Mesin : " + Mobilniaga.nomorMesin);
        System.out.println("Nomor Rangka : " + Mobilniaga.nomorRangka);
    }
}
