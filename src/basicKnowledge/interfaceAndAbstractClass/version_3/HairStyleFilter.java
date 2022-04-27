package basicKnowledge.interfaceAndAbstractClass.version_3;

public class HairStyleFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("HairStyleFilter");
    }
}
