/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/basededatosagencia?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
    private static final String usuario = "root"; 
    private static final String contraseña = "";     

    public static Connection conectar() {
        Connection con = null; 
        try {
            con = DriverManager.getConnection(URL, usuario, contraseña);
            System.out.println("Conexion establecida con exito.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
