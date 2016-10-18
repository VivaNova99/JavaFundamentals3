
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by veraivanova on 18.10.16.
 */
public class EmployeeSetComparatorByName implements Comparator<Stationery>{


    @Override
    public int compare(Stationery obj1, Stationery obj2) {

        return obj1.getName().compareTo(obj2.getName());

    }
}
