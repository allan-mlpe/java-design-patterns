package nullobject;

public class DescontoPercentual implements Desconto {

    private int percentual;

    public DescontoPercentual(int percentual) {
        super();
        this.percentual = percentual;
    }

    @Override
    public double darDesconto(double valorOriginal) {
        return valorOriginal - (valorOriginal * (percentual/100.0));
    }
}
