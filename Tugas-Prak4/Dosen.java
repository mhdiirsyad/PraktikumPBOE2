public class Dosen extends Pegawai {
    /*ATRIBUT */
    protected String jabatan;
    protected String fakultas;

    /*METODE */
    //Konstruktor
    public Dosen() {
    }

    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String jabatan, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.jabatan = jabatan;
        this.fakultas = fakultas;
    }

    //Setter
    //Mengeset jabatan dosen
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    //Mengeset fakultas tempat dosen
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    //Getter
    //Mengembalikan jabatan dosen
    public String getJabatan() {
        return jabatan;
    }

    //Mengembalikan fakultas dosen
    public String getFakultas() {
        return fakultas;
    }

    //Menampilkan info dosen
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan \t\t : " + this.jabatan);
        System.out.println("Fakultas \t\t : " + this.fakultas);
    }
    /*END OF CLASS DOSEN */
}
