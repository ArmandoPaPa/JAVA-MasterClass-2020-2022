import java.sql.*;

public class Main {
    public static void main(String[] args) {

        // try with Rss -> close itself!

//        try(Connection conn = DriverManager.getConnection
//                ("jdbc:sqlite:C:\\Users\\Armando PaPa\\Desktop\\MaM+10M\\Udemy" +
//                        "\\JAVA MasterClass\\S19_338_JDBC_TestDB\\src\\testjava.db");
//                Statement statement = conn.createStatement()) {

        try {

            // For older versions => Class.forName("org.sql.JDBC");

//            Connection conn = DriverManager.getConnection
//                    ("jdbc:sqlite:C:\\Users\\Armando PaPa\\Desktop\\MaM+10M\\Udemy" +
//                            "\\JAVA MasterClass\\0_SQLite\\Databases\\testjava.db");
            Connection conn = DriverManager.getConnection
                    ("jdbc:sqlite:C:\\Users\\Armando PaPa\\Desktop\\MaM+10M\\Udemy" +
                            "\\JAVA MasterClass\\S19_338_JDBC_TestDB\\src\\testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Joe', 111, 'joe@mail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jane', 121212, 'jane@mail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Fido', 333222111, 'dog@mail.com')");

//            statement.execute("UPDATE contacts SET phone=555111555 WHERE name='Joe'");

//            statement.execute("DELETE FROM contacts WHERE name='Armando'");


            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }
            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }
}