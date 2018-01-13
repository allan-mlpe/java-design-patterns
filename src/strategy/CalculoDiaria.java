package strategy;

public class CalculoDiaria implements Calculo {

    private int valorInicial;

    public CalculoDiaria(int valorInicial) {
        this.valorInicial = valorInicial;
    }

    @Override
    public int calcularTarifa(int quantidadeHoras) {
        return valorInicial * ((int) Math.ceil(quantidadeHoras / 24.0));
    }
}
