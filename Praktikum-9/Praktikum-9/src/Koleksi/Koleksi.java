/*Nama file	: Koleksi.java
* Deskripsi	: Kelas koleksi 
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package Koleksi;
import java.util.ArrayList;

public class Koleksi <T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        nbelm = 0;
        wadah = new ArrayList<>();
    }

    public T getIsi(int index){
        return wadah.get(index);
    }
    
    public void setIsi(int idx, T e){
        wadah.set(idx, e);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int nbelm) {
        this.nbelm = nbelm;
    }

    public void add(T e){
        wadah.add(e);
        nbelm++;
    }

    public T delete(int idx){
        T e = wadah.remove(idx);
        nbelm--;
        return e;
    }

    public void showAll(){
        for (T e : wadah) {
            System.out.print(e.toString() +" ");
        }
    }

}
