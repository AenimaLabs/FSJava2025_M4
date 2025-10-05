package evaluacionPortafolio.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Gestiona un conjunto de tareas.
 * Aplica composición: contiene una lista de objetos Tarea.
 * Cada método tiene una sola responsabilidad.
 */

public class Agenda {

    private List<Tarea> tareas;
    private int siguienteId;

    public Agenda() {
        this.tareas = new ArrayList<>();
        this.siguienteId = 1;
    }

    public void agregarTarea(String descripcion, LocalDate fecha) {
        Tarea nueva = new Tarea(siguienteId++, descripcion, fecha);
        tareas.add(nueva);
    }

    public List<Tarea> obtenerTodasLasTareas() {
        return new ArrayList<>(tareas); // Evita exposición directa de la lista interna
    }

    public List<Tarea> filtrarPorEstado(boolean completada) {
        return tareas.stream()
                .filter(t -> t.isCompletada() == completada)
                .collect(Collectors.toList());
    }

    public boolean marcarComoCompletada(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.setCompletada(true);
                return true;
            }
        }
        return false; // No encontrada
    }
}
