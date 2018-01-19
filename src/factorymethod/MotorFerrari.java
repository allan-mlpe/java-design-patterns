package factorymethod;

public class MotorFerrari extends Motor {

    public MotorFerrari(int potencia) {
        super(potencia);
    }

    @Override
    public void printModeloMotor() {
        System.out.println(String.format("Motor Ferrari - %d cv", this.potenciaMaxima));
    }
}
