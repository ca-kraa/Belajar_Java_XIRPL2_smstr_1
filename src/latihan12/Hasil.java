package latihan12;

class Hasil {
    public static void main(String[] args) {
        Bangunan_Datar persegi = new Bangunan_Datar();
        persegi.setLebarpanjang(8, 9);
        System.out.println("Persegi panjang dengan Private : " +persegi.getHitungLuas());
    }
}
