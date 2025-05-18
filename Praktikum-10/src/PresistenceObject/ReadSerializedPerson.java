/*Nama file	: ReadSerializedPerson.java
* Deskripsi	: Program untuk membaca objek Person yang sudah diserialisasi
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 18-05-2025
*/

package PresistenceObject;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            System.out.println("Nama: " + person.getName());
            s.close();
            System.out.println("Selesai membaca objek person " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
