package factory.withoutFactory;

public class Consumer {

    public static void main(String[] args){
        // remember, when you new a Tesla, the type of Tesla is Car, an interface but not a class anymore.
        Car carTesla = new Tesla();
        Car carToyota = new Toyota();

        carTesla.name();
        carToyota.name();
    }
}
