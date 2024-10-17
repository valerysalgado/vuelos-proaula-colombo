package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection connect() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/basededatosagencia";
            String usuario = "root";
            String contraseña = "";
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return con;
    }

    public boolean authenticateUser(String usuario, String contraseña) {
        String sql = "SELECT * FROM usuarios WHERE nombre = ? AND contraseña = ?";
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario);
            pstmt.setString(2, contraseña);
            ResultSet rs = pstmt.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            System.out.println("Error al autenticar usuario: " + e.getMessage());
            return false;
        }
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarioList = new ArrayList<>();
        String sql = "SELECT identificacion, nombre,  correo, telefono FROM usuarios";

        try (Connection con = ConexionDB.conectar(); PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String contraseña = rs.getString("contraseña");
                String nombre = rs.getString("nombre");
                String rol = rs.getString("rol");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                 String identificacion = rs.getString("identificacion");

                Usuario usuario = new Usuario(contraseña, nombre,correo, telefono, identificacion);
                usuarioList.add(usuario);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener usuario: " + e.getMessage());
        }

        return usuarioList;
    }

    public void RegistrarUsuario(String contraseña, String nombre, String correo, String telefono, String identificacion) {

        String sql = "INSERT INTO usuarios (contraseña, nombre, correo,telefono, identificacion) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = ConexionDB.conectar(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            
            pstmt.setString(1, contraseña);
            pstmt.setString(2, nombre);
            pstmt.setString(3, correo);
            pstmt.setString(4, telefono);
            pstmt.setString(5, identificacion);
            
            
            
            

            pstmt.executeUpdate();
            System.out.println("Usuario registardo con exito.");

        } catch (SQLException e) {
            System.err.println("Error al registrar el usuario: " + e.getMessage());
        }
    }

}
