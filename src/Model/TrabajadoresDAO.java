
package Model;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TrabajadoresDAO {

     public List<Trabajadores> obtenerTrabajadores() {
        List<Trabajadores> trabajadoreslist = new ArrayList<>();
        String sql = "SELECT identificacion, nombre, apellido, correo, telefono, avion FROM trabajadores";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String identificacion = rs.getString("identificacion");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String avion = rs.getString("avion");

               Trabajadores trabajador = new Trabajadores(identificacion, nombre, apellido, correo, telefono,avion);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener trabajadores: " + e.getMessage());
        }

        return trabajadoreslist;
    }
    
    public void contratarTrabajador(String nombre, String apellidos, String correo, String telefono, LocalDate fechaContratacion, String avion) {
    

    String sql = "INSERT INTO profesores (identificacion, nombre, apellido, correo_electronico, telefono, fecha_contratacion, avion) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection con = ConexionDB.conectar();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        
        pstmt.setString(2, nombre);
        pstmt.setString(3, apellidos);
        pstmt.setString(4, correo);
        pstmt.setString(5, telefono);
        pstmt.setDate(6, java.sql.Date.valueOf(fechaContratacion));
        pstmt.setString(7, avion);

        pstmt.executeUpdate();
        System.out.println("Profesor insertado con exito.");
        
    } catch (SQLException e) {
        System.err.println("Error al insertar el profesor: " + e.getMessage());
    }
    }
}
    
