public abstract class RuangFSM {
    /*Atribut */
    private String kode;
    private double panjang;
    private double lebar;
    private int kapasitas;
    static int counterRuang; 
    
    /*Metode */
    // Konstruktor
    protected RuangFSM() {
        counterRuang++;
    }

    protected RuangFSM(String kode, double panjang, double lebar, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.kapasitas = kapasitas;
        counterRuang++;
    }

    //Mutator
    //Mengeset kode 
    public void setKode(String kode){
        this.kode = kode;
    }

    //Mengeset panjang
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    //Mengeset lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    //Mengeset kapasitas 
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    //Selector
    //Mengembalikan kode
    public String getKode() {
        return kode;
    }

    //Mengembalikan panjang
    public double getPanjang(){
        return panjang;
    }

    //Mengembalikan lebar
    public double getLebar() {
        return lebar;
    }

    //Mengembalikan kapasitas 
    public int getKapasitas() {
        return kapasitas;
    }

    //Mengembalikan counterRuang
    static int getCounterRuang(){
        return counterRuang;
    }

    //Mencetak info ruang
    public void printRuang(){
        System.out.println("Kode ruang\t: "+kode);
        System.out.println("Panjang\t: "+panjang);
        System.out.println("Lebar\t: "+lebar);
        System.out.println("Kapasitas\t:"+kapasitas);
    }

    //Metode abstrak
    // biaya kebersihan
    public abstract double hitungBiayaKebersihan();
}