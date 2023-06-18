package latihan4;

public class Switch {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai) {
            case 'A':
                System.out.println("TOP");
                break;
            case 'B':
                System.out.println("SIP");
                break;
            case 'C':
                System.out.println("NOT BAD");
                break;
            default:
                System.out.println("ULANGI LAGI");
        }
    }
}
