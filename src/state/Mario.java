package state;

public class Mario {

    private MarioState state;

    public Mario() {
        state = new MarioPequeno();
    }

    public void pegarCogumelo() throws MarioMortoException {
        state = state.pegarCogumelo();
    }

    public void pegarPena() throws MarioMortoException {
        state = state.pegarPena();
    }

    public void pegarFlor() throws MarioMortoException {
        state = state.pegarFlor();
    }

    public void levarDano() throws MarioMortoException {
        state = state.levarDano();
    }

    public MarioState getState() {
        return state;
    }

    private void setState(MarioState state) {
        this.state = state;
    }
}
