/*Nama file	: SerializePerson.java
* Deskripsi	: Program untuk serialisasi objek Person
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 18-05-2025
*/

package PresistenceObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Person implements Serializable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
