package basicKnowledge.interfaceAndAbstractClass.version_3;

public class BackgroundFilter implements CombinableFilter {
    @Override
    public void doFilter() {
        System.out.println("BackgroundFilter");
    }

    @Override
    public void doCombinableFilter(Filter combinedFilter) {
        combinedFilter.doFilter();
        this.doFilter();
        System.out.println("doCombinableFilter");
    }
}
