package state;

public class MarioMorto implements MarioState {
    @Override
    public MarioState pegarCogumelo() throws MarioMortoException {
        throw new MarioMortoException();
    }

    @Override
    public MarioState pegarFlor() throws MarioMortoException {
        throw new MarioMortoException();
    }

    @Override
    public MarioState pegarPena() throws MarioMortoException {
        throw new MarioMortoException();
    }

    @Override
    public MarioState levarDano() throws MarioMortoException {
        throw new MarioMortoException();
    }
}