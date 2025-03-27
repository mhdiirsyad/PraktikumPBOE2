public class LabNonKomputer extends Laboratorium{
    /*Atribut */
    private String MataKuliah;
    static int counterLabNonKomputer;

    /*Metode */
    public LabNonKomputer(){
        counterLabNonKomputer++;
    }

    public LabNonKomputer(String kode, double panjang, double lebar, int kapasitas, String namaLab, double hargaSewa, String Matakuliah){
        super(kode, panjang, lebar, kapasitas, namaLab, hargaSewa, "Lab Non Komputer");
        this.MataKuliah = Matakuliah;
        counterLabNonKomputer++;
    }

    public void setMatakuliah(String MataKuliah){
        this.MataKuliah = MataKuliah;
    }

    public String getMatakuliah(){
        return MataKuliah;
    }

    static int getCounterLabNonKom(){
        return counterLabNonKomputer;
    }

    @Override
    public void printRuang(){
        super.printRuang();
        System.out.println("Matakuliah\t: "+ MataKuliah);
    }
}
