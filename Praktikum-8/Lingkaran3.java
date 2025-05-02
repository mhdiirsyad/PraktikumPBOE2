public class Lingkaran3 extends BangunDatar3 {
    private double jejari;

    public Lingkaran3(double jejari){
        this.jejari = jejari;
    }

    @Override
    public double hitungKeliling(){
        return 2*this.jejari*3.14;
    }
}
