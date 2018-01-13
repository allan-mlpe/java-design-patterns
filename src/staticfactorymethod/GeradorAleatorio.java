package staticfactorymethod;

import java.util.concurrent.ThreadLocalRandom;

public class GeradorAleatorio {

    private int minValue;
    private int maxValue;

    private GeradorAleatorio(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int nextValue() {
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }

    // Static Factory Methods
    public static GeradorAleatorio maiorQue(int i) {
        return new GeradorAleatorio(i, Integer.MAX_VALUE);
    }

    public static GeradorAleatorio menorQue(int i) {
        return new GeradorAleatorio(Integer.MIN_VALUE, i);
    }

    public static GeradorAleatorio entre(int i, int i1) {
        return new GeradorAleatorio(i, i1);
    }
}
