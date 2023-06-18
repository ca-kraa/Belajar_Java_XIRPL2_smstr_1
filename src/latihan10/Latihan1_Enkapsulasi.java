package latihan10;

public class Latihan1_Enkapsulasi {
    public int lebar;
    public int panjang;
    public int luas;
    public void display(){
        lebar = 8;
        panjang = 11;
        luas = lebar * panjang;
        System.out.println("LUAS PERSEGI PANJANG");
        System.out.println(luas);
    }
}
class Latihan2_Enkapsulasi {
    public static void main(String[] args) {
        Latihan1_Enkapsulasi obj = new Latihan1_Enkapsulasi();
        obj.display();
    }
}

