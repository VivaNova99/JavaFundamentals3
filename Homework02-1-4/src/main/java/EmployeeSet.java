import java.util.*;

/**
 * Created by veraivanova on 17.10.16.
 */
public class EmployeeSet {

//    public Stationery[] EmployeeSet() {
//        return stationeriesForOlga;
//    }

    Stationery[] stationeriesForOlga = {
            new Pen(7, "SimpleBlackPen"),
            new Pencil(8, "RedPencil"),
            new Eraser(8, "Eraser"),
            new Notebook(15, "YellowNotebook"),
            new PaperForPrinter(20, "PaperForPrinter")
    };

//    Stationery[] stationeriesForPetr = {
//            new Pen(10, "BluePen"),
//            new Pencil(8, "SimplePencil"),
//            new Eraser(8, "Eraser"),
//            new Notebook(11, "SmallNotebook"),
//            new PaperForPrinter(20, "PaperForPrinter")
//    };

    Stationery[] stationeriesForOlgaByName = stationeriesForOlga;

    public void stationeriesForOlgaSortingByName(){
        Arrays.sort(stationeriesForOlgaByName, new Comparator<Stationery>() {
            @Override
            public int compare(Stationery obj1, Stationery obj2) {

                return obj1.getName().compareTo(obj2.getName());

            }
        });
    }

    public Stationery[] getStationeriesForOlgaByName(){
        stationeriesForOlgaSortingByName();
        return stationeriesForOlgaByName;
    }

    Stationery[] stationeriesForOlgaByPrice = stationeriesForOlga;

    public void stationeriesForOlgaSortingByPrice(){
        Arrays.sort(stationeriesForOlgaByPrice, new Comparator<Stationery>() {
            @Override
            public int compare(Stationery obj1, Stationery obj2) {

                if (obj1.getPrice() > obj2.getPrice())
                    return 1;

                else if (obj1.getPrice() < obj2.getPrice())
                    return -1;

                else
                    return -1;

            }
        });
    }

    public Stationery[] getStationeriesForOlgaByPrice(){
        stationeriesForOlgaSortingByPrice();
        return stationeriesForOlgaByPrice;
    }

    Stationery[] stationeriesForOlgaByNameAndPrice = stationeriesForOlga;

    public void stationeriesForOlgaSortingByNameAndPrice(){

        Arrays.sort(stationeriesForOlgaByNameAndPrice, new Comparator<Stationery>() {
            @Override
            public int compare(Stationery obj1, Stationery obj2) {

                if (obj1.getPrice() > obj2.getPrice())
                    return 1;

                else if (obj1.getPrice() < obj2.getPrice())
                    return -1;

                else if ((obj1.getPrice() == obj2.getPrice()) & (0 < obj1.getName().compareTo(obj2.getName())))
                    return 1;

                else
                    return -1;

            }
        });

    }

    public Stationery[] getStationeriesForOlgaByNameAndPrice(){
        stationeriesForOlgaSortingByNameAndPrice();
        return stationeriesForOlgaByNameAndPrice;
    }

}
