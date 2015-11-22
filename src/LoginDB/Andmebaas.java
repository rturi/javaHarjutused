package LoginDB;

import java.sql.*;

/**
 * Created by Roland on 22/11/2015.
 */
public class Andmebaas {

    Connection conn;

    public Andmebaas() {
        seadistaAndmebaas();
    }

    public void seadistaAndmebaas() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:login.db");
            System.out.println("andmebaas loodud");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void sulgeYhendus() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void seadistaTabel() {
        try {
            Statement statement = conn.createStatement();
            String sql = "CREATE TABLE USER (ID INT AUTO_INCREMENT, USERNMAE TEXT, PASSWORD TEXT, FULLNAME TEXT, PHONE TEXT);";
            statement.executeUpdate(sql);
            statement.close();
            System.out.println("tabel on loodud");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registreeriKasutaja(String kasutajanimi, String parool) {
        try {
            Statement statement = conn.createStatement();
            String sql = "INSERT INTO USER (USERNMAE, PASSWORD) VALUES ('" + kasutajanimi + "', '"+ parool + "');";
            statement.executeUpdate(sql);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void kuvaRead(String kasutajanimi) {
        Statement statement = null;
        try {
            statement = conn.createStatement();
            String sql = "SELECT * FROM USER WHERE USERNMAE = '" + kasutajanimi + "'";
            ResultSet results = statement.executeQuery(sql);

            String abKasutaja = results.getString("USERNMAE");
            System.out.println(abKasutaja);

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
