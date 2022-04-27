package factory.factoryMethod;

public class Consumer {
    public static void main(String[] args) {

        Car carTesla = new TeslaFactory().getCar();
        Car carToyota = new ToyotaFactory().getCar();

        carTesla.name();
        carToyota.name();

    }
}
