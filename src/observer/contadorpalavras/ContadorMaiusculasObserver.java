package observer.contadorpalavras;

public class ContadorMaiusculasObserver implements ContadorPalavrasObserver {

    private int quantidade;

    @Override
    public void contar(String palavra) {
        if(Character.isUpperCase(palavra.charAt(0)))
            quantidade++;
    }

    @Override
    public int getContagem() {
        return quantidade;
    }
}
