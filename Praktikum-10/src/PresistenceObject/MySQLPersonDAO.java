/*Nama file	: MySQLPersonDAO.java
* Deskripsi	: implementasi PersonDAO untuk MySQL
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 18-05-2025
*/

package PresistenceObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLPersonDAO implements PersonDAO{
    @Override
    public void savePerson(Person P) throws Exception {
        String name = P.getName();

        //Connection to db
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/pbo", "root", "");

        //Query
        String query = "INSERT INTO person (name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        con.close();
    }
}
