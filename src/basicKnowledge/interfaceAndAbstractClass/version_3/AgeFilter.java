package basicKnowledge.interfaceAndAbstractClass.version_3;

public class AgeFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("AgeFilter");
    }
}
