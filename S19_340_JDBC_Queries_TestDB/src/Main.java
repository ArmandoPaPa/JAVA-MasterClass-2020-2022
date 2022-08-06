import java.sql.*;

public class Main {

    //.executeQuery() and using Constants

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Armando PaPa\\" +
            "Desktop\\MaM+10M\\Udemy\\JAVA MasterClass\\S19_340_JDBC_Queries_TestDB\\src\\" +
            DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {

        // try with Rss -> close itself!

//        try(Connection conn = DriverManager.getConnection
//                ("jdbc:sqlite:C:\\Users\\Armando PaPa\\Desktop\\MaM+10M\\Udemy" +
//                        "\\JAVA MasterClass\\S19_340_JDBC_Queries_TestDB\\src\\testjava.db");
//                Statement statement = conn.createStatement()) {

        try {

            // For older versions => Class.forName("org.sql.JDBC");

//            Connection conn = DriverManager.getConnection
//                    ("jdbc:sqlite:C:\\Users\\Armando PaPa\\Desktop\\MaM+10M\\Udemy" +
//                            "\\JAVA MasterClass\\0_SQLite\\Databases\\testjava.db");

            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            conn.setAutoCommit(false);

            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");

            insertContact(statement, "Tim", 787878, "tim@mail.com");
            insertContact(statement, "Kiana", 696969, "kiana@mail.com");
            insertContact(statement, "Lucy", 999111999, "lucy@mail.com");
            insertContact(statement, "Anna", 111222333, "anna@mail.com");


            //Statements without method call:

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Tim', 787878, 'tim@mail.com')");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Kiana', 696969, 'kiana@mail.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Lucy', 999111999, 'lucy@mail.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Anna', 111222333, 'anna@mail.com')");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=555111555" +
                    " WHERE " + COLUMN_NAME + "='Tim'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='Anna'");


            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);

            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }


            // Hard-coded version:

//            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
//                    "(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Joe', 111, 'joe@mail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jane', 121212, 'jane@mail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Fido', 333222111, 'dog@mail.com')");

//            statement.execute("UPDATE contacts SET phone=555111555 WHERE name='Joe'");

//            statement.execute("DELETE FROM contacts WHERE name='Armando'");


//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
//            while (results.next()) {
//                System.out.println(results.getString("name") + " " +
//                        results.getInt("phone") + " " +
//                        results.getString("email"));
//            }

            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public static void insertContact(Statement statement, String name, int phone, String email)
            throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "'," + phone + ", '" + email + "')");
    }

}











