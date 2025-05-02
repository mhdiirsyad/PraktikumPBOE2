public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran3 l = new Lingkaran3(2.0);
        BangunDatarGeneric<Lingkaran3> bdg = new BangunDatarGeneric<>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
        System.out.println("Bangun Datar: " + bdg.get().getClass().getName());
    }
}
