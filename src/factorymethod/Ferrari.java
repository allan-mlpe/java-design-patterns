package factorymethod;

public class Ferrari extends Carro {

    @Override
    public void obterMotor() {
        motor = new MotorFerrari(500);
    }
}
