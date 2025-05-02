/*Nama file	: MAnabul.java
* Deskripsi	: main class anabul
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/

package Tugas;

import java.util.ArrayList;

public class MAnabul {
    public static void main(String[] args) {
        // Instansiasi objek
        Anabul A1 = new Kucing("Tom");
        Anabul A2 = new Anjing("Bulky");
        Anabul A3 = new Burung("Chiko");
        Kucing A4 = new Kucing("Jerry");
        Anjing A5 = new Anjing("Bob");
        Burung A6 = new Burung("Chiku");

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(A1);
        anabuls.add(A2);
        anabuls.add(A3);
        anabuls.add(A4);
        anabuls.add(A5);
        anabuls.add(A6);

        for (Anabul anb : anabuls){
            System.out.println("Nama: "+ anb.getNama());
            anb.Gerak();
            anb.Bersuara();
            System.out.println();
        }
    }
}
