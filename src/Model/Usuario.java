/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//atributos
public class Usuario {
    private String id_usuario;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String rol;
    private String correo;
    
//constructor
    public Usuario(String name, String apellido, String email, String identificacion, String celular) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.rol = rol;
        this.correo = correo;
        
        
    }
//getter and setter
    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
     public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
