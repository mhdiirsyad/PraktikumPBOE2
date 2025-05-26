/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
/**
 *
 * @author Irsyad
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        //insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: "+mhsAdd);
        displayAll();
        
        //update
        System.out.println("===Update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama : "+mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: "+mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        //delete
        System.out.println("===Delete");
        System.out.println("akan di delete: "+service.getById(5));
        service.delete(5);
        displayAll();
    }
    
    public static void displayAll() throws SQLException{
        System.out.println("===DisplayAll");
        List<Mahasiswa> listmhs = service.getAll();
        if(listmhs.isEmpty()){
            System.out.println("Tabel Kosong");
        }else{
            for(Mahasiswa mhs: listmhs){
                System.out.println(mhs.toString());
            }
        }
    }
}
