/*Nama file	: Student.java
* Deskripsi	: kelas Student yang merupakan subclass dari kelas Person
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) {
        return hr > 2 && hr < 8;
    }
}
