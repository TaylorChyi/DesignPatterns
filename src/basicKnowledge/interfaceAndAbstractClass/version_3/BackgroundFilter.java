package basicKnowledge.interfaceAndAbstractClass.version_3;

public class BackgroundFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("BackgroundFilter");
    }
}
