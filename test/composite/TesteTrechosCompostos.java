package composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteTrechosCompostos {

    @Test
    public void trechoComEscala() {
        TrechoAereoSimples t1 = new TrechoAereoSimples("GRU", "FOR", 200, 400);
        TrechoAereoSimples t2 = new TrechoAereoSimples("FOR", "NAT", 150, 200);
        TrechoAereoComEscala t3 = new TrechoAereoComEscala(t1, t2);

        assertEquals("GRU", t3.getOrigem());
        assertEquals("NAT", t3.getDestino());
        assertEquals(350, t3.getCusto());
        assertEquals(600, t3.getDistancia());
    }

    @Test(expected = RuntimeException.class)
    public void trechoComEscalaAeroportosDiferentes() {
        TrechoAereoSimples t1 = new TrechoAereoSimples("GRU", "BSB", 200, 400);
        TrechoAereoSimples t2 = new TrechoAereoSimples("FOR", "NAT", 150, 200);
        new TrechoAereoComEscala(t1, t2);
    }

    @Test
    public void trechoComConexao() {
        TrechoAereoSimples t1 = new TrechoAereoSimples("GRU", "FOR", 200, 400);
        TrechoAereoSimples t2 = new TrechoAereoSimples("FOR", "NAT", 150, 200);
        TrechoAereo t3 = new TrechoAereoConexao(t1, t2, 80);

        assertEquals("GRU", t3.getOrigem());
        assertEquals("NAT", t3.getDestino());
        assertEquals(430, t3.getCusto());
        assertEquals(600, t3.getDistancia());
    }

    @Test
    public void trechoCompostoEscalaConexao() {
        TrechoAereo t1 = new TrechoAereoSimples("REC", "BSB", 200, 200);
        TrechoAereo t2 = new TrechoAereoSimples("BSB", "GRU", 350, 200);
        TrechoAereo t3 = new TrechoAereoComEscala(t1, t2);
        TrechoAereo t4 = new TrechoAereoSimples("GRU", "NAT", 400, 400);
        TrechoAereo conexao = new TrechoAereoConexao(t3, t4, 100);

        assertEquals("REC", conexao.getOrigem());
        assertEquals("NAT", conexao.getDestino());
        assertEquals(1050, conexao.getCusto());
        assertEquals(800, conexao.getDistancia());

    }
}
