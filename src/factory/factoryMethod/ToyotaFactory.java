package factory.factoryMethod;

public class ToyotaFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Toyota();
    }
}
