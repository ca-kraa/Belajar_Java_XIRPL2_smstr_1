package inheritance;

public class Lingkaran extends Bangun_Datar {

    // Jari - Jari Lingkaran
    float r;

    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Linkaran : " +luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran : " +keliling);
        return keliling;
    }
}
