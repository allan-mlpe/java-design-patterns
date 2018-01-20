package factorymethod;

public class Ferrari extends Carro {

    @Override
    public void obterMotor() {
        this.motor = new MotorFerrari(500);
    }
}
