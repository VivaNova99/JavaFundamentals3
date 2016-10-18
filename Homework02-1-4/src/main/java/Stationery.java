import java.util.Comparator;

/**
 * Created by veraivanova on 09.09.16.
 */
public abstract class Stationery {

    private int price;
    private String name;

    String getName(){return name;}

    int getPrice(){return price;}


//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }


    //    double price = 0.0;
//    String name = "Канцтовар";
//    Integer id;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Stationery that = (Stationery) o;
//
//        if (Double.compare(that.price, price) != 0) return false;
//        return !(name != null ? !name.equals(that.name) : that.name != null);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        temp = Double.doubleToLongBits(price);
//        result = (int) (temp ^ (temp >>> 32));
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        return result;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
