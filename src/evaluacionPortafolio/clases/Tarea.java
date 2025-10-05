package evaluacionPortafolio.clases;

import java.time.LocalDate;

/**
 * Representa una tarea en la agenda.
 * Aplica encapsulamiento: atributos privados, acceso mediante getters/setters.
 */

public class Tarea {

    private int id;
    private String descripcion;
    private LocalDate fecha;
    private boolean completada; // true = completada, false = pendiente

    public Tarea(int id, String descripcion, LocalDate fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.completada = false; // Por defecto, pendiente
    }

    // Getters y setters
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public LocalDate getFecha() { return fecha; }
    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    @Override
    public String toString() {
        return String.format("ID: %d | Descripción: %s | Fecha: %s | Estado: %s",
                id, descripcion, fecha, completada ? "Completada" : "Pendiente");
    }
}
