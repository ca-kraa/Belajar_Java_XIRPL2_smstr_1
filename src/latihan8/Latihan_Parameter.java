package latihan8;

class Luas{
    int panjang , lebar, hasil;
    void input_data(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    int hitung(){
        hasil = panjang * lebar;
        System.out.print("Luas Persegi Panjang = " +hasil);
        return hasil;
    }
}
public class Latihan_Parameter {
    public static void main(String[] args) {
        Luas obj = new Luas();
        obj.input_data(9,5);
        obj.hitung();
    }
}
