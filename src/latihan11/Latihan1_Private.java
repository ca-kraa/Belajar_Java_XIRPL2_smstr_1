package latihan11;

import latihan10.Latihan1_Enkapsulasi;

public class Latihan1_Private {
    public int lebar;
    public int panjang;
    public int luas;

    public void setLebarPanjang(int lebar, int panjang){
        this.lebar = lebar;
        this.panjang = panjang;

    }
    public int getPanjang(){
        return  panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int getHitungLuas(){
        luas = panjang * lebar;
        System.out.println("Luas Nya Adalah : " +luas);
        return luas;
    }
}
 class Latihan2_Private{
    public static void main(String[] args) {
        Latihan1_Private obj = new Latihan1_Private();
        obj.setLebarPanjang(8,11);
        System.out.println("PERSEGI DENGAN PRIVATE");
        obj.getLebar();
        obj.getPanjang();
        obj.getHitungLuas();
    }
}
