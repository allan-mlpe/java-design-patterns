package factorymethod;

public class Fusca extends Carro {

    @Override
    public void obterMotor() {
        this.motor = new MotorFusca(100);
    }
}
