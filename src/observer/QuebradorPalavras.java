package observer;

import java.util.HashMap;
import java.util.Map;

public class QuebradorPalavras {

    Map<String, ContadorPalavrasObserver> contadores = new HashMap<>();

    public QuebradorPalavras() {
    }

    /*
        Método que "notifica" os observers da classe
     */
    public String[] quebrar(String frase) {
        String[] palavras = frase.split(" ");

        for(String palavra : palavras) {
            for(ContadorPalavrasObserver c : contadores.values()) {
                c.contar(palavra);
            }
        }

        return palavras;
    }

    /*
        Método que adiciona novos observadores
     */
    public void adicionaContador(String nomeContador, ContadorPalavrasObserver contador) {
        contadores.put(nomeContador, contador);
    }

    public int getContagem(String nomeContador) {
        return contadores.get(nomeContador).getContagem();
    }
}
