public class Fakultas {
    // Atribut
    public static double TARIF_KEBERSIHAN;

    //METODE
    //Konstruktor
    public Fakultas(){
    }

    public Fakultas(double TARIF_KEBERSIHAN){
        Fakultas.TARIF_KEBERSIHAN = TARIF_KEBERSIHAN;
    }
    // Mengeset tarif kebersihan fakultas
    public void setTarif(double TARIF_KEBERSIHAN){
        Fakultas.TARIF_KEBERSIHAN = TARIF_KEBERSIHAN;
    }

    static double getTarif(){
        return TARIF_KEBERSIHAN;
    }
}
