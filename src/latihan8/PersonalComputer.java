package latihan8;


public class PersonalComputer {
    String merek;
    String processor;
    String ram;
    String penyimpanan;
    String harga;

    public static void main(String[] args) {
        PersonalComputer laptop = new PersonalComputer();
        laptop.merek = "Macbook Pro 13";
        laptop.processor = "Chip Apple M2";
        laptop.ram = "8 GB";
        laptop.penyimpanan = " 512 GB SSD";
        laptop.harga = "Rp 19.296.645";
        System.out.println("Merek Laptop : " +laptop.merek);
        System.out.println("Processor Laptop : " +laptop.processor);
        System.out.println("Ram Laptop : " +laptop.ram);
        System.out.println("Harga Laptop :" +laptop.harga);
    }
}
