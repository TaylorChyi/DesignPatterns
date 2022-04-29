package basicKnowledge.interfaceAndAbstractClass.version_3;

public class FilterDemo {
    private static CombinableFilter backgroundFilter;
    private static Filter frontFilter;

    public static void main(String[] args) {
        backgroundFilter = new BackgroundFilter();
        frontFilter = new HairStyleFilter();
        backgroundFilter.doCombinableFilter(frontFilter);
    }
}
