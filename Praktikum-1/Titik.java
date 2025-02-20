/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method class
 * Pembuat   : Muhammad Irfan Irsyad
 * Tanggal   : 20-02-2025
 */

 public class Titik {
    double absis;
    double ordinat;
    static int titikCounter = 0;
    
    /*Methode*/
    /*Konstruktor membuat titik (0,0) */
    Titik() {
        absis = 0;
        ordinat = 0;
        titikCounter++;
    }

    /*Konstruktor titik (x, y) */
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        titikCounter++;
    }

    /*Mengembalikan nilai titikCounter */
    static int getTitikCounter() {
        return titikCounter;
    }

    /*Mengembalikan nilai Absis */
    double getAbsis() {
        return absis;
    }

    /*Mengembalikan nilai Ordinat */
    double getOrdinat() {
        return ordinat;
    }

    /*Mengeset nilai Absis */
    void setAbsis(double x) {
        absis = x;
    }

    /*Mengeset nilai Ordinat */
    void setOrdinat(double y) {
        ordinat = y;
    }

    /*Menggeser titik sejauh x, y */
    void Geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    } 

    /*Menampilkan koordinat titik */
    void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    // /*Menampilkan jumlah titik */
    void printTitikCount() {
        System.out.println(this.titikCounter);
    }

    /*Menampilkan kuadran */
    int getKuadran() {
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
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2)+Math.pow(ordinat, 2));
    }

    /*Mengitung jarak titik ke pusat */
    double getJarak(Titik T2) {
        return Math.sqrt(Math.pow(absis-T2.absis, 2)+Math.pow(ordinat-T2.ordinat, 2));
    }

    /*Pencerminan terhadap sumbu x */
    void refleksiX() {
        this.ordinat = ordinat * -1;
    }

    /*Pencerminan terhadap sumbu Y */
    void refleksiY() {
        this.absis = absis * -1;
    }

    /*Menghasilkan titik baru hasil pencerminan terhadap sumbuX */
    Titik getRefleksiX() {
        Titik T2 = new Titik(this.absis, this.ordinat*-1);
        return T2;
    }

    /*Menghasilkan titik baru hasil refleksi terhadap sumbuY */
    Titik getRefleksiY() {
        Titik T2 = new Titik(this.absis*-1, this.ordinat);
        return T2;
    }
    /*End class titik*/
 }