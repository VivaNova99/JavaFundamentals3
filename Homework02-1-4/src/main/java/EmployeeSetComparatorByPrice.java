import java.util.Comparator;

/**
 * Created by veraivanova on 18.10.16.
 */
public class EmployeeSetComparatorByPrice implements Comparator<Stationery> {

    @Override
    public int compare(Stationery obj1, Stationery obj2) {

        if (obj1.getPrice() > obj2.getPrice())
            return 1;

        else if (obj1.getPrice() < obj2.getPrice())
            return -1;

        else
            return 0;
    }

}
