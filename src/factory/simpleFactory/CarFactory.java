package factory.simpleFactory;

public class CarFactory {

    public static Car getCar(String carType) {
        if (carType.equals("Tesla")) {
            return new Tesla();
        }
        else {
            return new Toyota();
        }
    }
}
