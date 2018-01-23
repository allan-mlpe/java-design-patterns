package observer.contadorpalavras;

public class ContadorParesObserver implements ContadorPalavrasObserver {
    private int quantidade;

    @Override
    public void contar(String palavra) {
        if(palavra.length() % 2 == 0)
            quantidade++;
    }

    @Override
    public int getContagem() {
        return quantidade;
    }
}
