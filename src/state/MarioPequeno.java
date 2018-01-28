package state;

public class MarioPequeno implements MarioState {
    @Override
    public MarioState pegarCogumelo() {
        return new MarioGrande();
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
        return new MarioMorto();
    }
}
