package inheritance;

public class Segitiga extends Bangun_Datar {

    float alas;
    float tinggi;

    @Override
    float luas(){
        float luas = (float) (8.5 * (alas * tinggi));
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }
}
