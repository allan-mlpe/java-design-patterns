package factorymethod;

public abstract class Motor {

    protected int potenciaMaxima;

    public Motor(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public abstract void printModeloMotor();

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }
}
