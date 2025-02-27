public class Dosen {
    /*Atribut*/
    private String nip;
    private String nama;
    private String prodi;

    /*METHOD */
    //Konstruktor
    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Mutator
    //mengeset nip Dosen
    public void setNIP(String nip){
        this.nip = nip;
    }

    //Mengeset nama dosen
    public void setNama(String nama){
        this.nama = nama;
    }

    //Mengeset Prodi Dosen
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //Selektor
    //Mengembalikan nip dosen
    public String getNIP(){
        return nip;
    }

    //Mengembalikan Nama Dosen
    public String getNama(){
        return nama;
    }

    //Mengembalikan Prodi Dosen
    public String getProdi(){
        return prodi;
    }
}
