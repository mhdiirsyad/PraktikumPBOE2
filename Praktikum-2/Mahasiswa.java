
import java.util.ArrayList;

public class Mahasiswa {
    /*Atribut */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*Metode */
    //konstruktor 
    public Mahasiswa (){
        listMatKul = new ArrayList<>();
    }

    public Mahasiswa (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatKul = new ArrayList<>();
    }

    //Mutator 
    //Mengeset nim Mahasiswa
    public void setNIM (String nim) {
        this.nim = nim;
    }
    
    //mengeset nama mahasiswa
    public void setNama (String nama) {
        this.nama = nama;
    }

    //Mengeset prodi mahasiswa
    public void setProdi (String prodi) {
        this.prodi = prodi;
    }

    //Mengeset Dosen wali
    public void setDosWali (Dosen doswal) {
        this.dosenWali = doswal;
    }

    //Mengeset Kendaraan
    public void setKendaraan (Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //Selektor
    //Mengembalikan nim mahasiswa
    public String getNIM() {
        return nim;
    }

    //Mengembalikan nama mahasiswa
    public String getNama() {
        return nama;
    }

    //Mengembalikan prodi mahasiswa
    public String getProdi() {
        return prodi;
    }

    //mengembalikan objek dosen wali
    public Dosen getDosenWali(){
        return dosenWali;
    }

    //Mengembalikan objek kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    //Menambahkan mata kuliah
    public void addMatKul (MataKuliah matKul){
        if (this.listMatKul.size()<=50){
            listMatKul.add(matKul);
        }else {
            System.out.println("Daftar matakuliah sudah penuh");
        }
    }

    //Mengembalikan jumlah sks mahasiswa
    public int getjumSKS() {
        int sum = 0;
        for (MataKuliah mataKuliah : this.listMatKul) {
            sum += mataKuliah.getSKS();
        }
        return sum;
    }

    //Mengembalikan jumlah matakuliah mahasisawa
    public int getjumMatkul() {
        return listMatKul.size();
    }

    //Menampilkan data mahasiswa
    public void printMhs() {
        System.out.println("nim\t: " + this.getNIM());
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Prodi\t: " + this.getProdi());
    }

    public void printDetailMhs() {
        this.printMhs();
        System.out.println("Daftar matkul : ");
        for(MataKuliah matkul : this.listMatKul){
            System.out.println(matkul.getNamaMk());
        }
        System.out.println("Dosen Wali\t: " + getDosenWali().getNama());
        System.out.println("Kendaraan\t: " + getKendaraan().getJenis());
    }
}
