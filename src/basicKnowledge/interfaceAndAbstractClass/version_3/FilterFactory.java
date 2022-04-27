package basicKnowledge.interfaceAndAbstractClass.version_3;

public class FilterFactory{
    public static Filter getFilter(String action) {
        if (action.equals(AgeFilter.class.getName())) {
            return new AgeFilter();
        }else if (action.equals(HairStyleFilter.class.getName())) {
            return new HairStyleFilter();
        } else {
            return new GenderFilter();
        }
    }
}
