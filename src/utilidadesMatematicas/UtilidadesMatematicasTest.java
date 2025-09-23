package utilidadesMatematicas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilidadesMatematicasTest {

    private UtilidadesMatematicas util;

    //Fixture: configuración común para todos los tests
    @BeforeEach
    void setUp() {
        //Aquí se inicializan variables o objetos que se usan en todos los tests
        //Por ejemplo, se pueden inicializar variables con valores conocidos
        //o se pueden inicializar objetos con valores conocidos
        System.out.println("Prueba iniciada...");
        util = new UtilidadesMatematicas();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Prueba finalizada...");
    }

    //Prueba unitaria para el método esPar
    @Test
    void esPar() {
        assertTrue(util.esPar(2));
        assertTrue(util.esPar(0));
        assertTrue(util.esPar(-2));
//      assertFalse(UtilidadesMatematicas.esPar(3)); forma estática
    }

    //Prueba unitaria para el método obtenerFactorial
    @Test
    void obtenerFactorial() {
        assertEquals(1, util.obtenerFactorial(0));
        assertEquals(1, util.obtenerFactorial(1));
        assertEquals(6, util.obtenerFactorial(3));
        assertEquals(24, util.obtenerFactorial(4));
        assertEquals(120, util.obtenerFactorial(5));
        assertThrows(IllegalArgumentException.class, () -> util.obtenerFactorial(-1));


//        assertEquals(1, UtilidadesMatematicas.obtenerFactorial(0));
//        assertEquals(1, UtilidadesMatematicas.obtenerFactorial(1));
//        assertEquals(2, UtilidadesMatematicas.obtenerFactorial(2));
//        assertEquals(6, UtilidadesMatematicas.obtenerFactorial(3));
//        assertEquals(24, UtilidadesMatematicas.obtenerFactorial(4));
//        assertEquals(120, UtilidadesMatematicas.obtenerFactorial(5));
//        assertThrows(IllegalArgumentException.class, () -> UtilidadesMatematicas.obtenerFactorial(-1));
    }

    //Prueba unitaria para el método esPrimo
    @Test
    void esPrimo() {
        assertTrue(util.esPrimo(3));
        assertTrue(util.esPrimo(13));
        assertFalse(util.esPrimo(4));
        assertFalse(util.esPrimo(15));
        assertThrows(IllegalArgumentException.class, () -> util.esPrimo(-1));



//        assertTrue(UtilidadesMatematicas.esPrimo(3));
//        assertFalse(UtilidadesMatematicas.esPrimo(4));
//        assertTrue(UtilidadesMatematicas.esPrimo(13));
//        assertFalse(UtilidadesMatematicas.esPrimo(15));
//        assertThrows(IllegalArgumentException.class, () -> UtilidadesMatematicas.esPrimo(-1));
    }

    @Test
    void obtenerMCD() {
        assertEquals(1, util.obtenerMCD(2, 3));
        assertEquals(2, util.obtenerMCD(4, 6));
        assertEquals(3, util.obtenerMCD(9, 12));
        assertEquals(5, util.obtenerMCD(15, 25));
        assertEquals(0, util.obtenerMCD(0, 0));
        assertThrows(IllegalArgumentException.class, () -> util.obtenerMCD(-1, 2));
    }
}