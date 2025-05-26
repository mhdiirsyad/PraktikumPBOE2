/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utililies;

import java.sql.*;

/**
 *
 * @author Irsyad
 */
public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if(koneksi == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3308/pbo";
                String user = "root";
                String pass = "";
                
                koneksi = DriverManager.getConnection(url, user, pass);
                if(koneksi != null){
                    System.out.println("Database Connected!!");
                }
            }catch (ClassNotFoundException e) {
                System.out.println("Driver failed: "+e.getMessage());
            } catch (SQLException se) {
                System.out.println("Connection failed: "+se.getMessage());
            }
        }
        return koneksi;
    }
    
    
}
