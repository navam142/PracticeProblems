package org.example.jdbcconnection;

public class Application {
    public static void main(String[] args) {
        DBConnection.closeConnection();
        DBConnection.getConnection();
//        DBConnection.createTable("persons");
//        DBConnection.insertPerson(new Person("John", "Doe", 25));
//        DBConnection.insertPerson(new Person("Navam", "Sharma", 21));
        DBConnection.getAllPerson();
        DBConnection.deletePersonBYId(1);
        DBConnection.getAllPerson();
    }
}
