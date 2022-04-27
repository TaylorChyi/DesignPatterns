package basicKnowledge.interfaceAndAbstractClass.version_2;

public class FilterDemo {
    private static Filter filter;

    public static void main(String[] args) {
        filter = new AgeFilter();
        filter.doFilter();
    }
}
