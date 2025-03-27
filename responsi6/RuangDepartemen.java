public class RuangDepartemen extends RuangFSM{
    private int jumlahMeja, jumlahKursi, jumlahLemari;
    private Department departemen;
    static int counterRuangDepartemen;
    
    public RuangDepartemen(String kode, double panjang, double lebar, int kapasitas, int jumlahMeja, int jumlahKursi, int jumlahLemari, Department departemen) {
        super(kode, panjang, lebar, kapasitas);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.departemen = departemen;
        counterRuangDepartemen++;
    }
    
    static int getCounterRuangDepartement(){
        return counterRuangDepartemen;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * departemen.getTarifKebersihan();
    }

    @Override
    public void printRuang(){
        super.printRuang();
        System.out.println("Jumlah Meja\t: "+jumlahMeja);
        System.out.println("Jumlah Kursi\t: "+jumlahKursi);
        System.out.println("Jumlah Lemari\t: "+jumlahLemari);
        System.out.println("Departemen\t: "+departemen.getNamaDepartemen());
        System.out.println("Kebersihan: "+hitungBiayaKebersihan());
    }
}
