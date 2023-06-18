package Polimorfisme_Dinamis;

abstract class Hewan {
    protected abstract void munculSuara();
}

class Kucing extends Hewan {
    @Override
    protected void munculSuara(){
        System.out.println("Suara Kucing : Meow... Meow .. meow.");
    }
}

class Burung extends Hewan {
    @Override
    protected void munculSuara(){
        System.out.println("Suara Burung : Cit...cit..cit.");
    }
}

class  Tampil {
    public static void main(String[] args) {
        Hewan Kucing = new Kucing();
        Kucing.munculSuara();

        Hewan burung = new Burung();
        burung.munculSuara();
    }
}
