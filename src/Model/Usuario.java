/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//atributos
public class Usuario {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String rol;
    private String correo;
    private String telefono;
    private String identificacion;
    
//constructor
    public Usuario(String name, String apellido, String email, String identificacion, String celular) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.rol = rol;
        this.correo = correo;
        this.telefono = telefono;
        this.identificacion = identificacion;
        
        
    }
//getter and setter
   

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
     public String gettelefono(String telefono) {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }
      public String getidentificacion(String identificacion) {
        return identificacion;
    }

    public void setidentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
}
