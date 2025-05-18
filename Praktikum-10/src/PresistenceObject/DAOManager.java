/*Nama file	: DAOManager.java
* Deskripsi	: Pengelola DAO dalam program
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 18-05-2025
*/

package PresistenceObject;

public class DAOManager {
    private PersonDAO personDAO;

    public PersonDAO getPersonDAO() {
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
}
