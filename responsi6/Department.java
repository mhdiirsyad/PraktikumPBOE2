public class Department {
    private String nama, ketuaDepartemen;
    private double tarifKebersihan;

    public Department(){
    }
    
    public Department(String nama, String ketuaDepartemen, double tarifKebersihan) {
        this.nama = nama;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifKebersihan = tarifKebersihan;
    }

    public String getKetuaDepartment(){
        return ketuaDepartemen;
    }

    public String getNamaDepartemen(){
        return nama;
    }
    public double getTarifKebersihan() {
        return tarifKebersihan;
    }
}
