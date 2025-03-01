/* Nama File : Titik.java
* Deskripsi : Berisi atribut dan method class
* Pembuat   : Muhammad Irfan Irsyad
* Tanggal   : 01-03-2025
*/

public class Titik {
    private double absis;
    private double ordinat;
    private static int titikCounter = 0;

    /*Methode*/
    /*Konstruktor membuat titik (0,0) */
    public Titik() {
        absis = 0;
        ordinat = 0;
        titikCounter++;
    }

    /*Konstruktor titik (x, y) */
    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        titikCounter++;
    }

    /*Mengembalikan nilai titikCounter */
    public static int getTitikCounter() {
        return titikCounter;
    }

    /*Mengembalikan nilai Absis */
    public double getAbsis() {
        return absis;
    }

    /*Mengembalikan nilai Ordinat */
    public double getOrdinat() {
        return ordinat;
    }

    /*Mengeset nilai Absis */
    public void setAbsis(double x) {
        absis = x;
    }

    /*Mengeset nilai Ordinat */
    public void setOrdinat(double y) {
        ordinat = y;
    }

    /*Menggeser titik sejauh x, y */
    public void Geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    } 

    /*Menampilkan koordinat titik */
    public void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    // /*Menampilkan jumlah titik */
    public void printTitikCount() {
        System.out.println(this.titikCounter);
    }

    /*Menampilkan kuadran */
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }else if (absis < 0 && ordinat > 0) {
            return 2;
        }else if (absis < 0 && ordinat < 0) {
            return 3;
        }else if (absis > 0 && ordinat < 0) {
            return 4;
        }else {
            return -1;
        }
    }

    /*Mengitung jarak titik ke pusat */
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2)+Math.pow(ordinat, 2));
    }

    /*Mengitung jarak titik ke pusat */
    public double getJarak(Titik T2) {
        return Math.sqrt(Math.pow(absis-T2.absis, 2)+Math.pow(ordinat-T2.ordinat, 2));
    }

    /*Pencerminan terhadap sumbu x */
    public void refleksiX() {
        this.ordinat = ordinat * -1;
    }

    /*Pencerminan terhadap sumbu Y */
    public void refleksiY() {
        this.absis = absis * -1;
    }

    /*Menghasilkan titik baru hasil pencerminan terhadap sumbuX */
    public Titik getRefleksiX() {
        Titik T2 = new Titik(this.absis, this.ordinat*-1);
        return T2;
    }

    /*Menghasilkan titik baru hasil refleksi terhadap sumbuY */
    public Titik getRefleksiY() {
        Titik T2 = new Titik(this.absis*-1, this.ordinat);
        return T2;
    }
    /*End class titik*/
}