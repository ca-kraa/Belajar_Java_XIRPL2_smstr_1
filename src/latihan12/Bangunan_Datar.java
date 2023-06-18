package latihan12;

public class Bangunan_Datar {
    protected int lebar;
    protected int panjang;
    protected  int luas;

    protected void setLebarpanjang(int lebar, int panjang){
        this.lebar = lebar;
        this.panjang = panjang;
    }
    protected int getHitungLuas(){
        luas = panjang * lebar;
        return luas;
    }
}
