package latihan13;

public class Kucing extends Mamalia {
    public static void main(String[] args) {
        Binatang b = new Binatang();
        Mamalia m = new Mamalia();
        Kucing k = new Kucing();
        System.out.println(m instanceof Binatang);
        System.out.println(k instanceof Mamalia);
        System.out.println(k instanceof Binatang);
    }
}
