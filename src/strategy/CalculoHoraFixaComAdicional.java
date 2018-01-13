package strategy;

public class CalculoHoraFixaComAdicional implements Calculo {

    private int valorInicial;
    private int limiteHorasInicial;
    private int valorHoraExcedente;

    public CalculoHoraFixaComAdicional(int valorInicial, int limiteHorasInicial, int valorHoraExcedente) {
        this.valorInicial = valorInicial;
        this.limiteHorasInicial = limiteHorasInicial;
        this.valorHoraExcedente = valorHoraExcedente;
    }

    @Override
    public int calcularTarifa(int quantidadeHoras) {
        int valorAPagar = valorInicial;
        if(quantidadeHoras > limiteHorasInicial)
            valorAPagar += (quantidadeHoras - limiteHorasInicial) * valorHoraExcedente;
        return valorAPagar;
    }
}
