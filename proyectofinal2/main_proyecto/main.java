/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_proyecto;
import java.io.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author usuario
 */
public class main {
    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;
    static String bd = "XE";
    static String login = "BDUMG20";
    static String password = "123";
    static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection Enlace(Connection conn) throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, login, password);
                    
        } catch (ClassNotFoundException e) {
            System.out.println("Clase noo encontrada");
            
        }
        return conn;
    }
    
    public static Statement sta(Statement st) throws SQLException {
        conn = Enlace(conn);
        st = conn.createStatement();
        return st;        
    }
    
    public static ResultSet EnlEst(ResultSet rs, String tablaOrigen) throws SQLException{
        st = sta(st);
        rs = st.executeQuery("select * from " + tablaOrigen);
        return rs;
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

}

