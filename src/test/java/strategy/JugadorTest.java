package strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JugadorTest {
    
    private Jugador jugador;
    
    @Before
    public void init() {
        jugador = new Jugador();
    }
    
    @Test
    public void testUsoPistola() {
        jugador.seleccionarPistola();
        jugador.realizarDisparo();
        jugador.realizarDisparo();
        jugador.realizarDisparo();
        jugador.realizarDisparo();
        jugador.realizarDisparo();
        assertEquals(10, jugador.revisarMunicion());
        jugador.realizarRecarga();
        assertEquals(15, jugador.revisarMunicion());
    }
    
    
    @Test
    public void testUsoRifle() {
        jugador.seleccionarRifle();
        jugador.realizarDisparo();
        jugador.realizarDisparo();
        jugador.realizarDisparo();
        jugador.realizarDisparo();
        jugador.realizarDisparo();
        assertEquals(45, jugador.revisarMunicion());
        jugador.realizarRecarga();
        assertEquals(60, jugador.revisarMunicion());
    }

}
