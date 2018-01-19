package factorymethod;

public abstract class Carro {

    protected Motor motor;

    public Carro() {
        //a subclasse irá definir qual o tipo de motor usado
        //uma vez que o método obterMotor é abstrato
        obterMotor();
    }

    public int potenciaMotor() {
        return motor.getPotenciaMaxima();
    }

    public abstract void obterMotor();
}
