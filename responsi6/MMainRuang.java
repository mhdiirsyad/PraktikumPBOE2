public class MMainRuang {
    public static void main(String[] args) {
        // Object Fakultas
        Fakultas FSM = new Fakultas(5000);
        //Object Ruang Kelas
        RuangKelas R1 = new RuangKelas("A102", 5, 5, 50, 50, 10);
        System.out.println("Info Kelas");
        R1.printRuang();
        RuangKelas.getCounterKelas();
        System.out.println();

        // Object Laboratorium Komputer
        LabKomputer L1 = new LabKomputer("D1", 6, 4, 30, "Lab D1", 200000, 30);
        L1.printRuang();
        LabKomputer.getCounterLabKom();
        System.out.println();

        //Object department
        Department Informatika = new Department("Informatika", "Ady", 10000);
        //Object Lab Non Komputer
        LabNonKomputer L2 = new LabNonKomputer("E2", 6, 5, 40, "Lab Biologi", 200000, "Biologi");
        L2.printRuang();
        LabNonKomputer.getCounterLabNonKom();
        System.out.println();

        // Object Ruang Department
        RuangDepartemen IF = new RuangDepartemen("IF1", 6, 6, 2, 2, 2, 2, Informatika);
        IF.printRuang();
        RuangDepartemen.getCounterRuangDepartement();

        //Object Ruang Dosen
        RuangDosen A = new RuangDosen("A1", 3, 3, 1, "A", 1, 1, Informatika);
        A.printRuang();
        RuangDosen.getCounterRuangDosen();
    }
}
