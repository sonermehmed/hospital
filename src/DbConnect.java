
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo-ideaPad-15isk
 */
public class DbConnect {

    static String dbUsername = "root";
    static String dbPassword = "";
    static String dbServerUrl = "jdbc:mysql://localhost:3306/hospital";
    static String dbClassPathUrl = "com.mysql.cj.jdbc.Driver";

    static public Connection databaseConnection() {

        Connection conn;
        try {
            Class.forName(dbClassPathUrl);
            JOptionPane.showMessageDialog(null, "Driver Loaded");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conn = DriverManager.getConnection(dbServerUrl, dbUsername, dbPassword);
            JOptionPane.showMessageDialog(null, "Connected");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
