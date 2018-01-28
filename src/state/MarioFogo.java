package state;

public class MarioFogo implements MarioState {
    @Override
    public MarioState pegarCogumelo() {
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        return this;
    }

    @Override
    public MarioState pegarPena() {
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {
        return new MarioGrande();
    }
}
