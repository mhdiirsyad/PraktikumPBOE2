/*Nama file	: LambdaList.java
* Deskripsi	: IMplementasi lambda pada List, digunakan sebagai parameter pada method.
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 05-06-2025
*/

import java.util.*;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
