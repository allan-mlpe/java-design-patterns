package state;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteSuperMario {

    @Test
    public void MarioPequenoPegaCogumelo() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarCogumelo();

        assertEquals(MarioGrande.class, m.getState().getClass());
    }

    @Test
    public void MarioPequenoPegaPena() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarPena();

        assertEquals(MarioCapa.class, m.getState().getClass());
    }

    @Test
    public void MarioPequenoPegaFlor() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarFlor();

        assertEquals(MarioFogo.class, m.getState().getClass());
    }

    @Test
    public void MarioPequenoSofreDano() throws MarioMortoException {
        Mario m = new Mario();
        m.levarDano();

        assertEquals(MarioMorto.class, m.getState().getClass());
    }

    @Test
    public void MarioGrandePegaCogumelo() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarCogumelo();

        m.pegarCogumelo();

        assertEquals(MarioGrande.class, m.getState().getClass());
    }

    @Test
    public void MarioGrandePegaFlor() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarCogumelo();

        m.pegarFlor();

        assertEquals(MarioFogo.class, m.getState().getClass());
    }

    @Test
    public void MarioGrandePegaPena() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarCogumelo();

        m.pegarPena();

        assertEquals(MarioCapa.class, m.getState().getClass());
    }

    @Test
    public void MarioGrandeSofreDano() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarCogumelo();

        m.levarDano();

        assertEquals(MarioPequeno.class, m.getState().getClass());
    }

    @Test
    public void MarioFogoPegaCogumelo() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarFlor();

        m.pegarCogumelo();

        assertEquals(MarioFogo.class, m.getState().getClass());
    }

    @Test
    public void MarioFogoPegaFlor() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarFlor();

        m.pegarFlor();

        assertEquals(MarioFogo.class, m.getState().getClass());
    }

    @Test
    public void MarioFogoPegaPena() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarFlor();

        m.pegarPena();

        assertEquals(MarioCapa.class, m.getState().getClass());
    }

    @Test
    public void MarioFogoSofreDano() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarFlor();

        m.levarDano();

        assertEquals(MarioGrande.class, m.getState().getClass());
    }

    @Test
    public void MarioCapaPegaCogumelo() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarPena();

        m.pegarCogumelo();

        assertEquals(MarioCapa.class, m.getState().getClass());
    }

    @Test
    public void MarioCapaPegaFlor() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarPena();

        m.pegarFlor();

        assertEquals(MarioFogo.class, m.getState().getClass());
    }

    @Test
    public void MarioCapaPegaPena() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarPena();

        m.pegarPena();

        assertEquals(MarioCapa.class, m.getState().getClass());
    }

    @Test
    public void MarioCapaSofreDano() throws MarioMortoException {
        Mario m = new Mario();
        m.pegarPena();

        m.levarDano();

        assertEquals(MarioGrande.class, m.getState().getClass());
    }

    @Test(expected = MarioMortoException.class)
    public void MarioMortoPegaCogumelo() throws MarioMortoException {
        Mario m = new Mario();
        m.levarDano();

        m.pegarCogumelo();
    }

    @Test(expected = MarioMortoException.class)
    public void MarioMortoPegaFlor() throws MarioMortoException {
        Mario m = new Mario();
        m.levarDano();

        m.pegarFlor();
    }

    @Test(expected = MarioMortoException.class)
    public void MarioMorotPegaPena() throws MarioMortoException {
        Mario m = new Mario();
        m.levarDano();

        m.pegarPena();
    }

    @Test(expected = MarioMortoException.class)
    public void MarioMortoSofreDano() throws MarioMortoException {
        Mario m = new Mario();
        m.levarDano();

        m.levarDano();
    }
}
