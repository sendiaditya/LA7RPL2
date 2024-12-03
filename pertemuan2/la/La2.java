package pertemuan2.la;

class Hewan {

    private String nama;
    private int energi;

    // Konstruktor
    public Hewan(String nama, int energi) {
        this.nama = nama;
        this.energi = energi;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk energi
    public int getEnergi() {
        return energi;
    }

    // Menambah energi
    public void makan() {
        energi += 4;
        System.out.println(nama + " makan dan sekarang energinya menjadi " + energi);
    }

    // Mengurangi energi
    public void berjalan() {
        if (energi >= 5) {
            energi -= 5;
            System.out.println(nama + " berjalan dan sekarang energinya menjadi " + energi);
        } else {
            System.out.println(nama + " terlalu lelah untuk berjalan.");
        }
    }

    public void bersuara() {
        System.out.println("Hewan ini bersuara.");
    }
}

// Kelas turunan Kucing
class Kucing extends Hewan {

    public Kucing(String nama, int energi) {
        super(nama, energi);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkata: Meow!");
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {

    public Anjing(String nama, int energi) {
        super(nama, energi);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkata: Bark!");
    }
}

public class La2 {

    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kitty", 10);
        Anjing anjing = new Anjing("Buddy", 12);

        kucing.bersuara();
        kucing.berjalan();
        kucing.makan();

        anjing.bersuara();
        anjing.berjalan();
        anjing.berjalan();
        anjing.makan();
    }
}
