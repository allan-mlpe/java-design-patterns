package state;

public class MarioGrande implements MarioState {
    @Override
    public MarioState pegarCogumelo() {
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {
        return new MarioPequeno();
    }
}
