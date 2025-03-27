public class RuangKelas extends RuangFSM{
    /*ATRIBUT */
    private int jmlKursiTersedia;
    private int jmlKursiRusak;
    static int counterKelas;
    private Fakultas fakultas;

    /*MEtode */
    // Konstruktor
    public RuangKelas(){
        counterKelas++;
    }

    public RuangKelas(String kode, double panjang, double lebar, int kapasitas, int jmlKursiTersedia, int jmlKursiRusak){
        super(kode, panjang, lebar, kapasitas);
        this.jmlKursiTersedia = jmlKursiTersedia;
        this.jmlKursiRusak = jmlKursiRusak;
        counterKelas++;
    }

    //Mutator
    //Mengeset jumlah Kursi yang tersedia
    public void setJmlKursitersedia(int jmlKursiTersedia){
        this.jmlKursiTersedia = jmlKursiTersedia;
    }

    //MEngeset jumlah kursi yang rusak
    public void setJmlKursiRusak(int jmlKursiRusak){
        this.jmlKursiRusak = jmlKursiRusak;
    }

    //Selector
    //Mengembalikan jumlah kursi yang rusak
    public int getJmlKursiRusak(){
        return jmlKursiRusak;
    }

    //Mengembalikan jumlah kursi yang tersedia
    public int getJmlKursiTersedia(){
        return jmlKursiTersedia;
    }

    //Mengembalikan jumlah kelas yang ada
    static int getCounterKelas(){
        return counterKelas;
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang()*getLebar()*Fakultas.getTarif();
    }

    //cetak info
    @Override
    public void printRuang(){
        super.printRuang();
        System.out.println("Kursi Tersedia\t: "+jmlKursiTersedia);
        System.out.println("Kursi Rusak\t: "+jmlKursiRusak);
        System.out.println("Biaya Kebersihan\t: "+hitungBiayaKebersihan());
    }

}
