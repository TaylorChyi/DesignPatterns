package factory.withoutFactory;

public class Tesla implements Car{
    @Override
    public void name(){
        System.out.println("Tesla");
    }
}
