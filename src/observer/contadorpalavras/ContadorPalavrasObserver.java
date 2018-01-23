package observer.contadorpalavras;

public interface ContadorPalavrasObserver {
    void contar(String palavra);

    int getContagem();
}
