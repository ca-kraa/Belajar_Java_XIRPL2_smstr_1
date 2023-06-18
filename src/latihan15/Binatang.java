package latihan15;

abstract class Binatang {
    protected abstract void munculHewan();

    static class Hewan extends Binatang {
        @Override
        protected void munculHewan(){
            System.out.println("==== HEWAN DEFAULT ====");
            System.out.println("Nama Hewan : Tidak Bernama");
            System.out.println("Suara Hewan : Tidak Bersuara");
            System.out.println("Berat Hewan : 0.0 KG");
        }
    }
    static class Kucing extends Binatang {
        protected void munculHewan(){
            System.out.println("==== HEWAN KUCING ====");
            System.out.println("Nama Kucing : Carberus");
            System.out.println("Suara Kucing : Miaw Meow Meong");
            System.out.println("Berat Kucing : 2.0 Kg");
        }
    }
    static class Singa extends Binatang{
        protected void munculHewan(){
            System.out.println("==== HEWAN SINGA ====");
            System.out.println("Nama Singa : Diablo");
            System.out.println("Suara Singa : Roaaarrrrrr");
            System.out.println("Berat Singa : 10.0 KG");
        }
    }
   static class Muncul {
       public static void main(String[] args) {
           Binatang Hewan = new Hewan();
           Hewan.munculHewan();

           Binatang Kucing = new Kucing();
           Kucing.munculHewan();

           Binatang Singa = new Singa();
           Singa.munculHewan();
       }
   }
}
