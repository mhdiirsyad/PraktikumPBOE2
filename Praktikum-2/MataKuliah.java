public class MataKuliah {
    /*Atribut */
    private String idMatkul;
    private String nama;
    private int sks;

    /*Metode */
    //Konstruktor
    public MataKuliah(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah (String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //Mutator 
    //Mengeset idMatkul
    public void setIdMatkul (String idMatkul){
        this.idMatkul = idMatkul;
    }

    //Mengeset nama matkul
    public void setNamaMk (String nama){
        this.nama = nama;
    }

    //Mengeset sks
    public void setSKS (int sks){
        this.sks = sks;
    }

    //Selektor
    //Mengembalikan idMatkul
    public String getIdMatkul (){
        return idMatkul;
    }

    //Mengembalikan nama Matkul
    public String getNamaMk(){
        return nama;
    }

    //Mengembalikan jumlah sks MK
    public int getSKS (){
        return sks;
    }
}
