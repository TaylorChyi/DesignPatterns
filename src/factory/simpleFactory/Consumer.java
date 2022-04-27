package factory.simpleFactory;

public class Consumer {
    public static void main(String[] args) {

        Car carTesla = CarFactory.getCar("Tesla");
        Car carToyota = CarFactory.getCar("Toyota");

        carTesla.name();
        carToyota.name();

    }
}
