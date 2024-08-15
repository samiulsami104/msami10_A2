import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First compare by FullName
        int nameComparison = v1.getFullName().compareTo(v2.getFullName());
        if (nameComparison != 0) {
            return nameComparison; // If names are not equal, return the result of the name comparison
        }

        // If names are equal, compare by YearsOld
        return Integer.compare(v1.getYearsOld(), v2.getYearsOld());
    }
}

