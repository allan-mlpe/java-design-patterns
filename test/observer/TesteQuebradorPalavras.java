package observer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteQuebradorPalavras {

    private static String frase = "O rato roeu as roupas do rei de Roma";

    @Test
    public void quebradorPalavras() {
        QuebradorPalavras quebrador = new QuebradorPalavras();
        String[] palavras = quebrador.quebrar(frase);

        assertEquals(9, palavras.length);
    }

    @Test
    public void contadorSimples() {
        QuebradorPalavras quebrador = new QuebradorPalavras();
        quebrador.adicionaContador("SIMPLES", new ContadorSimplesObserver());
        quebrador.quebrar(frase);

        assertEquals(9, quebrador.getContagem("SIMPLES"));
    }

    @Test
    public void contadorMaiusculas() {
        QuebradorPalavras quebrador = new QuebradorPalavras();
        quebrador.adicionaContador("MAIUSCULAS", new ContadorMaiusculasObserver());
        quebrador.quebrar(frase);

        assertEquals(2, quebrador.getContagem("MAIUSCULAS"));
    }

    @Test
    public void contadorPares() {
        QuebradorPalavras quebrador = new QuebradorPalavras();
        quebrador.adicionaContador("PARES", new ContadorParesObserver());
        quebrador.quebrar(frase);

        assertEquals(7, quebrador.getContagem("PARES"));
    }

    @Test
    public void contadorIntegrado() {
        QuebradorPalavras quebrador = new QuebradorPalavras();

        quebrador.adicionaContador("SIMPLES", new ContadorSimplesObserver());
        quebrador.adicionaContador("MAIUSCULAS", new ContadorMaiusculasObserver());
        quebrador.adicionaContador("PARES", new ContadorParesObserver());

        quebrador.quebrar(frase);

        assertEquals(9, quebrador.getContagem("SIMPLES"));
        assertEquals(2, quebrador.getContagem("MAIUSCULAS"));
        assertEquals(7, quebrador.getContagem("PARES"));
    }
}
