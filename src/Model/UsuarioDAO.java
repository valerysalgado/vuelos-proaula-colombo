package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection connect() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/login";
            String usuario = "root";
            String contraseña = "";
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return con;
    }

    public boolean authenticateUser(String username, String password) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            System.out.println("Error al autenticar usuario: " + e.getMessage());
            return false;
        }
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarioList = new ArrayList<>();
        String sql = "SELECT identificacion, nombre, apellido, correo, telefono FROM usuarios";

        try (Connection con = ConexionDB.conectar(); PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String identificacion = rs.getString("identificacion");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");

                Usuario usuario = new Usuario(identificacion, nombre, apellido, correo, telefono);
                usuarioList.add(usuario);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener usuario: " + e.getMessage());
        }

        return usuarioList;
    }

    public void RegistrarUsuario(String nombre, String apellidos, String correo, String telefono, LocalDate fechaderegistro) {

        String sql = "INSERT INTO usuarios (identificacion, nombre, apellido, correo_electronico, telefono, fecha_contratacion) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionDB.conectar(); PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setString(4, correo);
            pstmt.setString(5, telefono);
            pstmt.setDate(6, java.sql.Date.valueOf(fechaderegistro));

            pstmt.executeUpdate();
            System.out.println("Usuario registardo con exito.");

        } catch (SQLException e) {
            System.err.println("Error al registrar el usuario: " + e.getMessage());
        }
    }

}
