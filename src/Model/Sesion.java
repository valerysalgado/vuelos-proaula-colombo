/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sebastian JB
 */
public class Sesion {
    
     private static boolean sesionIniciada = false;

    public static boolean isSesionIniciada() {
        return sesionIniciada;
    }

    public static void iniciarSesion() {
        sesionIniciada = true;
    }

    public static void cerrarSesion() {
        sesionIniciada = false;
    }
    
}
