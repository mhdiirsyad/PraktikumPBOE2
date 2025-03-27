public class LabKomputer extends Laboratorium {
    /*Atribut */
    private int jmlKomputer;
    static int counterLabKom;

    /*Metode */
    //Konsturktor
    public LabKomputer(){
        counterLabKom++;
    }

    public LabKomputer(String kode, double panjang, double lebar, int kapasitas, String namaLab, double hargaSewa, int jmlKomputer){
        super(kode, panjang, lebar, kapasitas, namaLab, hargaSewa, "Lab Komputer");
        this.jmlKomputer = jmlKomputer;
        counterLabKom++;
    }

    public void setJmlKomputer(int jmlKomputer){
        this.jmlKomputer = jmlKomputer;
    }

    public int getJmlKomputer(){
        return jmlKomputer;
    }

    public static int getCounterLabKom(){
        return counterLabKom;
    }

    @Override
    public void printRuang(){
        super.printRuang();
        System.out.println("Jumlah Komputer\t: "+jmlKomputer);
    }
}
