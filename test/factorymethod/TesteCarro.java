package factorymethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCarro {

    @Test
    public void testePotenciaFusca() {
        Carro c = new Fusca();

        int potencia = c.potenciaMotor();

        assertEquals(100, potencia);
    }

    @Test
    public void testeClasseMotorFusca() {
        Carro c = new Fusca();

        String className = c.motor.getClass().getSimpleName();

        assertEquals("MotorFusca", className);
    }

    @Test
    public void testePotenciaFerrari() {
        Carro c = new Ferrari() ;

        int potencia = c.potenciaMotor();

        assertEquals(500, potencia);
    }

    @Test
    public void testeClasseMotorFerrari() {
        Carro c = new Ferrari();

        String className = c.motor.getClass().getSimpleName();

        assertEquals("MotorFerrari", className);
    }
}
