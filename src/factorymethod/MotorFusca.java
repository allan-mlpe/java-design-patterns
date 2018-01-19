package factorymethod;

public class MotorFusca extends Motor {

    public MotorFusca(int potencia) {
        super(potencia);
    }

    @Override
    public void printModeloMotor() {
        System.out.println(String.format("Motor Fusca - %d cv", this.potenciaMaxima));
    }
}
