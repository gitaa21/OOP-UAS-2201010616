package oop_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author taa
 * TGL : 2024-05-20
 */
public class koneksi {
    public static Connection getConnection() throws SQLException{
        Connection cnn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TodoList", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Koneksi ke Database Gagal");
        }
        return cnn;
    }
}
