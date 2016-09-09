/**
 * Created by veraivanova on 09.09.16.
 */
public abstract class Stationery implements Comparable {

    double price = 0.0;
    String name = "Канцтовар";
    Integer id;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
