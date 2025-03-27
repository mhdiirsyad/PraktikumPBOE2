public class RuangDosen extends RuangFSM{
    /*Atribut */
    private String namaDosen;
    private int jumlahMeja, jumlahKursi;
    private Department departemen;
    static int counterRuangDosen;
    
    public RuangDosen(String kode, double panjang, double lebar, int kapasitas, String namaDosen, int jumlahMeja, int jumlahKursi, Department departemen) {
        super(kode, panjang, lebar, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.departemen = departemen;
        counterRuangDosen++;
    }
    
    static int getCounterRuangDosen(){
        return counterRuangDosen;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * departemen.getTarifKebersihan();
    }

    @Override
    public void printRuang(){
        super.printRuang();
        System.out.println("Nama dosen\t: "+namaDosen);
        System.out.println("Jumlah Meja\t: "+jumlahMeja);
        System.out.println("Jumlah Kursi\t: "+jumlahKursi);
        System.out.println("Departemen\t: "+departemen.getNamaDepartemen());
        System.out.println("Kebersihan: "+hitungBiayaKebersihan());
    }
}
