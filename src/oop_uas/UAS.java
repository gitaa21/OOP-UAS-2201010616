package oop_uas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Taa
 * TGL : 2024-05-20
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        //list_all();
        
        //loadfoam
        Login FLogin = new Login();
        FLogin.setResizable(false);
        FLogin.setVisible(true);
    }
    public static void list_all() throws SQLException{
        Connection cnn = koneksi.getConnection();
        if(cnn.isClosed()){
            System.out.println("Connection Fail");
        }else{
            String sqlvd = "SELECT * FROM todo;";
            PreparedStatement PS = cnn.prepareStatement(sqlvd);
            ResultSet rs = PS.executeQuery();
            while(rs.next()){
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Date: " + rs.getString("date"));
                System.out.println("Category: " + rs.getString("category"));
            }
            cnn.close();
        }
    }
}
