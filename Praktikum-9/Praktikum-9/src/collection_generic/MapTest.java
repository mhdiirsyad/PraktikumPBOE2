/*Nama file	: MapTest.java
* Deskripsi	: Uji coba penggunaan koleksi Map
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package collection_generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "satu");
        map.put(2, "dua");

        System.out.println(map.get(1));

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
    }
}
