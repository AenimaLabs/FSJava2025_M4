package evaluacionPortafolio.test;


import evaluacionPortafolio.clases.Agenda;
import evaluacionPortafolio.clases.Tarea;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

    class AgendaTest {

        private Agenda agenda;

        @BeforeEach
        void setUp() {
            agenda = new Agenda();
        }

        @Test
        void testAgregarTarea() {
            agenda.agregarTarea("Reunión de equipo", LocalDate.of(2025, 4, 5));
            List<Tarea> tareas = agenda.obtenerTodasLasTareas();
            assertEquals(1, tareas.size());
            assertEquals("Reunión de equipo", tareas.getFirst().getDescripcion());
            assertFalse(tareas.getFirst().isCompletada());
        }

        @Test
        void testFiltrarPorEstado() {
            agenda.agregarTarea("Tarea 1", LocalDate.now());
            agenda.agregarTarea("Tarea 2", LocalDate.now());
            agenda.marcarComoCompletada(1);

            List<Tarea> pendientes = agenda.filtrarPorEstado(false);
            List<Tarea> completadas = agenda.filtrarPorEstado(true);

            assertEquals(1, pendientes.size());
            assertEquals(1, completadas.size());
            assertTrue(completadas.get(0).isCompletada());
        }

        @Test
        void testMarcarComoCompletada() {
            agenda.agregarTarea("Estudiar Java", LocalDate.now());
            boolean resultado = agenda.marcarComoCompletada(1);
            assertTrue(resultado);
            assertTrue(agenda.obtenerTodasLasTareas().get(0).isCompletada());
        }

        @Test
        void testMarcarComoCompletadaIdInexistente() {
            boolean resultado = agenda.marcarComoCompletada(999);
            assertFalse(resultado);
        }
    }

