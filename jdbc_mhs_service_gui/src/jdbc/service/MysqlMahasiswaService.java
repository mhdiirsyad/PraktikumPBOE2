/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import static jdbc.utililies.MysqlUtility.getConnection;
/**
 *
 * @author Irsyad
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = getConnection();
    }
    
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    
    public void add(String nama) throws SQLException{
        String query = "INSERT INTO mahasiswa (nama) VALUES ( '"+ nama + "')";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Insert successfull");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void update(Mahasiswa mhs) throws SQLException{
        String query = "UPDATE mahasiswa SET nama = '"
                + mhs.getNama() + "' WHERE id = "
                + mhs.getId();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Update successfull");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void delete(int id) throws SQLException{
        String query = "DELETE FROM mahasiswa WHERE id = "
                + id;
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Delete successfull");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public Mahasiswa getById(int id) throws SQLException{
        String query = "SELECT * FROM mahasiswa WHERE id = "
                + id;
        Mahasiswa mhs = new Mahasiswa();
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }     
        return mhs;
    }
    
    public List<Mahasiswa> getAll() throws SQLException{
        String query = "SELECT * FROM mahasiswa";
        List <Mahasiswa> mhsList = new ArrayList<>();
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mhsList.add(mhs);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }     
        return mhsList;
    }
    
    public void indexReset() throws SQLException{
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Reset index successfull");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public boolean isEmpty(){
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                return rs.getInt(1) == 0;
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    public void closeConnetion() throws SQLException{
        if(koneksi != null){
            try{
                koneksi.close();
                System.out.println("Disconnected");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
