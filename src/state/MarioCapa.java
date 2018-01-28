package state;

public class MarioCapa implements MarioState {
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
        return this;
    }

    @Override
    public MarioState levarDano() {
        return new MarioGrande();
    }
}
