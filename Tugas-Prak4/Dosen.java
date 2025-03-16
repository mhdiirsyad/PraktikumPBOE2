public class Dosen extends Pegawai {
    /*ATRIBUT */
    protected String fakultas;

    /*METODE */
    //Konstruktor
    public Dosen() {
    }

    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String jabatan, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, jabatan);
        this.fakultas = fakultas;
    }

    //Setter
    //Mengeset fakultas tempat dosen
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    //Getter
    //Mengembalikan fakultas dosen
    public String getFakultas() {
        return fakultas;
    }

    //Menampilkan info dosen
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas \t\t : " + this.fakultas);
    }
    /*END OF CLASS DOSEN */
}
