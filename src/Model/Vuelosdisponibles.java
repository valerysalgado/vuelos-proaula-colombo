/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sebastian JB
 */
public class Vuelosdisponibles {
    
     private int id;
    private String origen;
    private String destino;
    private String fechaSalida;
    private String fechaVuelta;
    private int asientosDisponibles;

    // Constructor vacío
    public Vuelosdisponibles() {
        // Puedes inicializar valores predeterminados aquí si es necesario
    }

    // Constructor con parámetros
    public Vuelosdisponibles(int id, String origen, String destino, String fechaSalida, String fechaVuelta, int asientosDisponibles) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaVuelta = fechaVuelta;
        this.asientosDisponibles = asientosDisponibles;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(String fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
}
    