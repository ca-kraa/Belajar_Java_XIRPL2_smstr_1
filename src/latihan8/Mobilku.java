package latihan8;

public class Mobilku {
    String warna, merk;
    // Ini Adalah Konstruktor
    public Mobilku(){
        warna = "Hitam";
        merk  = "BMW";
    }
    void maju() {
        System.out.println("Mobil " + merk + " Warna " + warna + " bergerak maju terus");
    }
    void mundur () {
        System.out.println("Mobil " + merk + " Warna " + warna + " bergereak mundur");
    }

    public static void main(String[] args) {
     // Membuat Objek Mobilsaya
        Mobilku Mobilsaya = new Mobilku();
        // memanggil objek
        Mobilsaya.maju(); // Pemanggilan Method Void Maju()
        Mobilsaya.mundur(); // Pemanggilan Method Void Mundur()
    }
}
