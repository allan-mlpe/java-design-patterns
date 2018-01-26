package composite;

public class TrechoAereoComEscala implements TrechoAereo {

    TrechoAereo trechoInicial;
    TrechoAereo trechoFinal;

    public TrechoAereoComEscala(TrechoAereoSimples t1, TrechoAereoSimples t2) {
        if(t1.getDestino().equals(t2.getOrigem())) {
            trechoInicial = t1;
            trechoFinal = t2;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public String getOrigem() {
        return trechoInicial.getOrigem();
    }

    @Override
    public String getDestino() {
        return trechoFinal.getDestino();
    }

    @Override
    public int getCusto() {
        return trechoInicial.getCusto() + trechoFinal.getCusto();
    }

    @Override
    public int getDistancia() {
        return trechoInicial.getDistancia() + trechoFinal.getDistancia();
    }
}
