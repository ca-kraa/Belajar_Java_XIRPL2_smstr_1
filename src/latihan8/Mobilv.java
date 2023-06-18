package latihan8;

public class Mobilv {
    String warna;
    int tahunProduksi;
    int nomorMesin;
    int nomorRangka;
    // Method Mengisi Variabel Instance
    void isi(String warna, int tahunProduksi , int nomorMesin , int nomorRangka){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.nomorMesin = nomorMesin;
        this.nomorRangka = nomorRangka;
    }
    // Method menampilkan isi variabel insrance
    String ambil_warna (){
        return warna;
    }
    int ambil_tahunProduksi(){
        return tahunProduksi;
    }
    int ambil_nomorMesin (){
        return  nomorMesin;
    }
    int ambil_nomorRangka (){
        return nomorRangka;
    }

    public static void main(String[] args) {
        // Buat objek baru
        Mobilv MobilSedan = new Mobilv();
        // Proses Pemanggilan Method void
        MobilSedan.isi("putih", 2012 , 134353 , 134532);
        System.out.println("Warna              : " +MobilSedan.ambil_warna());
        System.out.println("Tahun Produksi     : " +MobilSedan.ambil_tahunProduksi());
        System.out.println("Nomor Mesin        : " +MobilSedan.ambil_nomorMesin());
        System.out.println("Nomor Rangka       : " +MobilSedan.ambil_nomorRangka());
    }
}
