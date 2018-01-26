package composite;

public class TrechoAereoConexao extends TrechoAereoComEscala {

    private int tarifaAeroporto;

    public TrechoAereoConexao(TrechoAereoSimples t1, TrechoAereoSimples t2, int tarifa) {
        super(t1, t2);
        this.tarifaAeroporto = tarifa;
    }

    @Override
    public int getCusto() {
        return super.getCusto() + tarifaAeroporto;
    }
}
