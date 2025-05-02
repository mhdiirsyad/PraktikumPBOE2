/*Nama file	: ArrayListTest.java
* Deskripsi	: program penggunaan collection ArrayList
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 01-05-2025
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> strings = new ArrayList<>();

        // Add elemnts to the ArrayList
        strings.add("praktikum");
        strings.add("collections");
        strings.add("and generics");

        // delete an element from ArrayList
        strings.remove("praktikum");

        // print all elemnts of teh ArarayList
        for( String s : strings ){
            System.out.println(s + " ");
        }
    }
}