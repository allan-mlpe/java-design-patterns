package strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteTarifaEstacionamento {

    @Test
    public void tarifaFixaPorHora() {
        TarifaEstacionamento t = new TarifaEstacionamento(3, new CalculoHora(4));

        int valor = t.valor();

        assertEquals(12, valor);
    }

    @Test
    public void tarifaFixaComAdicionalPorHoraExcedente() {
        TarifaEstacionamento t =
                new TarifaEstacionamento(5, new CalculoHoraFixaComAdicional(5, 3, 2));

        int valor = t.valor();

        assertEquals(9, valor);
    }

    @Test
    public void tarifaFixaComAdicionalPorHoraExcedenteDentroDoLimite() {
        TarifaEstacionamento t =
                new TarifaEstacionamento(2, new CalculoHoraFixaComAdicional(5, 3, 2));

        int valor = t.valor();

        assertEquals(5, valor);
    }

    @Test
    public void tarifaDiaria() {
        TarifaEstacionamento t =
                new TarifaEstacionamento(50, new CalculoDiaria(20));

        int valor = t.valor();

        assertEquals(60, valor);
    }

    @Test
    public void tarifaDiariaMenorQueUmDia() {
        TarifaEstacionamento t =
                new TarifaEstacionamento(12, new CalculoDiaria(20));

        int valor = t.valor();

        assertEquals(20, valor);
    }
}
