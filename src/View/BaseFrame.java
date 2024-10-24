/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.Sesion; // Importa la clase que gestiona la sesión
import javax.swing.JButton;
import javax.swing.*;

public class BaseFrame {
     // Método para verificar si la sesión está iniciada
    protected void verificarSesion(JButton botonLogin) {
        if (Sesion.isSesionIniciada()) {
            botonLogin.setVisible(false); // Ocultar el botón de login si la sesión está iniciada
        }
    }
}
