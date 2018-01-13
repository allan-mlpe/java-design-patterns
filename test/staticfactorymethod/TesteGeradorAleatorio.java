package staticfactorymethod;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TesteGeradorAleatorio {

    private GeradorAleatorio ga;

    @Test
    public void testeGeradorComMinimo() {
        ga = GeradorAleatorio.maiorQue(5);

        int valor = ga.nextValue();

        assertTrue(valor >= 5);
    }

    @Test
    public void testeGeradorComMaximo() {
        ga = GeradorAleatorio.menorQue(10000);

        int valor = ga.nextValue();

        assertTrue(valor <= 10000);
    }

    @Test
    public void testeGeradorIntervalo() {
        ga = GeradorAleatorio.entre(10, 100);

        int valor = ga.nextValue();

        assertTrue(valor >= 10 && valor <= 100);

    }
}
