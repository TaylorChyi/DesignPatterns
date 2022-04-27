package basicKnowledge.interfaceAndAbstractClass.version_3;

public class GenderFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("GenderFilter");
    }
}
