package basicKnowledge.interfaceAndAbstractClass.version_1;

public class FilterDemo {
    private static Object filter;

    public static void main(String[] args) {
        filter = new AgeFilter();

        if (filter instanceof GenderFilter) {
            ((GenderFilter) filter).doFilter();
        } else if (filter instanceof AgeFilter) {
            ((AgeFilter) filter).doFilter();
        } else if (filter instanceof HairStyleFilter) {
            ((HairStyleFilter) filter).doFilter();
        }
    }
}
