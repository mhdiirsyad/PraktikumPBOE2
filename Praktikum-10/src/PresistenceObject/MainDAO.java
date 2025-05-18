/*Nama file	: MainDAO.java
* Deskripsi	: Main program untuk akses DAO
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 18-05-2025
*/

package PresistenceObject;

public class MainDAO {
    public static void main(String[] args) {
        System.out.println("Test");
        Person p = new Person("Indra");
        DAOManager dao = new DAOManager();
        dao.setPersonDAO(
            new MySQLPersonDAO()
        );

        try {
            dao.getPersonDAO().savePerson(p);
            System.out.println("Person saved: " + p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
