public class Laboratorium extends RuangFSM{
    /*ATRIbut */
    private String namaLab;
    private double hargaSewa;
    static int counterLaboratorium;
    private String Kategori;
    Fakultas fakultas;

    /*METODE */
    // Konstruktor
    public Laboratorium(){
        counterLaboratorium++;
    }

    public Laboratorium(String kode, double panjang, double lebar, int kapasitas, String namaLab, double hargaSewa, String Kategori){
        super(kode, panjang, lebar, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        this.Kategori = Kategori;
        counterLaboratorium++;  
    }

    public void setKategori(String Kategori){
        this.Kategori = Kategori;
    }

    /*Mutator */
    // Mengeset namaLab
    public void setNamaLab(String namaLab){
        this.namaLab = namaLab;
    }

    //Mengeset harga sewa
    public void setHargaSewa(double hargaSewa){
        this.hargaSewa = hargaSewa;
    }

    /*Selector */
    public String getNamabLab(){
        return namaLab;
    }

    public double getHargaSewa(){
        return hargaSewa;
    }

    public String getKategori(){
        return Kategori;
    }

    public static int getCounterLaboratorium(){
        return counterLaboratorium;
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang()*getLebar()*Fakultas.getTarif();
    }

    @Override
    public void printRuang(){
        super.printRuang();
        System.out.println("Nama Lab\t: "+namaLab);
        System.out.println("Harga sewa\t: "+hargaSewa);
        System.out.println("Kategori\t: "+Kategori);
    }
}
