/*Nama file	: Person.java
* Deskripsi	: person database model
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 18-05-2025
*/

package PresistenceObject;
public class Person {
    private int id;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
