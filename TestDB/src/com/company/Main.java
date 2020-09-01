package com.company;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\tejas\\IdeaProjects\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tejas\\IdeaProjects\\TestDB\\testjava.db");
//            Statement statement = conn.createStatement()){
        try{
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tejas\\IdeaProjects\\TestDB\\testjava.db");
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
//                                    "(name TEXT, phone INTEGER, email TEXT)");

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                    " (" + COLUMN_NAME + " text, " +
                                            COLUMN_PHONE + " integer, " +
                                            COLUMN_EMAIL + " text" +
                                    ")");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                    " (" + COLUMN_NAME + ", " +
//                                            COLUMN_PHONE + ", " +
//                                            COLUMN_EMAIL +
//                                    " ) " +
//                                    "VALUES('Tejas', 6545678, 'tejas@email.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                    " (" + COLUMN_NAME + ", " +
//                                            COLUMN_PHONE + ", " +
//                                            COLUMN_EMAIL +
//                                    " ) " +
//                                    "VALUES('Joe', 45632, 'joe@anywhere.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                    " (" + COLUMN_NAME + ", " +
//                                            COLUMN_PHONE + ", " +
//                                            COLUMN_EMAIL +
//                                    " ) " +
//                                    "VALUES('Jane', 4829484, 'jane@somewhere.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                    " (" + COLUMN_NAME + ", " +
//                                            COLUMN_PHONE + ", " +
//                                            COLUMN_EMAIL +
//                                    " ) " +
//                                    "VALUES('Fido', 9038, 'dog@email.com')");

            insertContact(statement, "Tejas", 6545678, "tejas@email.com");
            insertContact(statement, "Joe", 45632, "joe@anywhere.com");
            insertContact(statement, "Jane", 4829484, "jane@somewhere.com");
            insertContact(statement, "Fido", 9038, "dog@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + " = 5566789" +
                    " WHERE " + COLUMN_NAME + " = 'Jane'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                            " WHERE " + COLUMN_NAME + " = 'Joe'");



//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                    "VALUES ('Tejas', 6545678, 'tejas@email.com')");
//                                    "VALUES ('Joe', 45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                    "VALUES ('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                    "VALUES ('Fido', 9038, 'dog@email.com')");

//            statement.execute("UPDATE contacts SET phone = 5566789 WHERE name = 'Jane'");
//            statement.execute("DELETE FROM contacts WHERE name = 'Joe'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                    results.getInt(COLUMN_PHONE) + " " +
                                    results.getString(COLUMN_EMAIL));
            }

            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
