/*Nama file	: LambdaMap.java
* Deskripsi	: Implementasi lambda pada Map, digunakan untuk pada method.
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 05-06-2025
*/

import java.util.HashMap;
public class LambdaMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123130085", "Muhammad Irfan Irsyad");
        mahasiswaMap.put("24060123130086", "Casey Amphibious");
        mahasiswaMap.put("24060123130087", "Twibi Tribios");
        mahasiswaMap.put("24060123130088", "Phainon Khaslana");

        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + ": " + nama));
    }
}
