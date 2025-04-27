/*Nama file	: Person.java
* Deskripsi	: Kelas person yang merupakan superclass dari kelas Student
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public boolean isAsleep(int hr){
        return hr<7 || hr>22;
    }
    public String toString(){
        return name;
    }

    public void status(int hr){
        if (isAsleep(hr)){
            System.out.println("Now offline "+ this);
        } else {
            System.out.println("Now online "+ this);
        }
    }
}
