package factory.withoutFactory;

public class Toyota implements Car{
    @Override
    public void name(){
        System.out.println("Toyota");
    }
}
