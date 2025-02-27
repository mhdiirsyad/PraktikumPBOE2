public class Kendaraan {
    /*Atribut */
    private String noPlat;
    private String jenis;

    /*Metode */
    //Konstruktor
    public Kendaraan () {
        noPlat = "";
        jenis = "";
    }

    public Kendaraan (String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Mutator
    //Mengeset plat nomor kendaraan
    public void setNoPlat (String noPlat){
        this.noPlat = noPlat;
    }

    //Mengeset jenis kendaraan
    public void setJenis (String jenis){
        if(jenis.toLowerCase()=="motor" || jenis.toLowerCase()=="mobil"){
            this.jenis = jenis;
        }else{
            System.out.println("Jenis kendaraan harus motor atau mobil");
        }
    }

    //Selektor
    //Mengembalikan plat nomor kendaraan
    public String getNoPlat (){
        return noPlat;
    }

    //Mengembalikan jenis kendaraan
    public String getJenis (){
        return jenis;
    }
}
