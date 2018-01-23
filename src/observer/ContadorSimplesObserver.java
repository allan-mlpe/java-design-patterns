package observer;

public class ContadorSimplesObserver implements ContadorPalavrasObserver {

    private int quantidade;

    @Override
    public void contar(String palavra) {
        quantidade++;
    }

    @Override
    public int getContagem() {
        return quantidade;
    }
}
