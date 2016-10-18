import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by veraivanova on 18.10.16.
 */
public class CompareInspector {

    public static void main(String[] args) {

        System.out.println("Введите '1', чтобы сортировать по цене; /n " +
                "Введите '2', чтобы сортировать по названию; /n " +
                "Введите '3', чтобы сортировать сперва по названию, затем по цене");

        int choice = 0;
        Scanner MyChoice = new Scanner(System.in);
        choice = MyChoice.nextInt();

        switch (choice) {

            case 1:
                Comparator<Stationery> compByName = new EmployeeSetComparatorByName();

                TreeSet<Stationery> stationeryForPetr1 = new TreeSet(compByName);
                stationeryForPetr1.add(new Pen(10, "BluePen"));
                stationeryForPetr1.add(new Pencil(8, "SimplePencil"));
                stationeryForPetr1.add(new Eraser(8, "Eraser"));
                stationeryForPetr1.add(new Notebook(11, "SmallNotebook"));
                stationeryForPetr1.add(new PaperForPrinter(20, "PaperForPrinter"));

                for (Stationery stationeries : stationeryForPetr1) {

                    System.out.println(stationeries.getPrice() + " " + stationeries.getName());
                }
                break;

            case 2:
                Comparator<Stationery> compByPrice = new EmployeeSetComparatorByPrice();

                TreeSet<Stationery> stationeryForPetr2 = new TreeSet(compByPrice);
                stationeryForPetr2.add(new Pen(10, "BluePen"));
                stationeryForPetr2.add(new Pencil(8, "SimplePencil"));
                stationeryForPetr2.add(new Eraser(8, "Eraser"));
                stationeryForPetr2.add(new Notebook(11, "SmallNotebook"));
                stationeryForPetr2.add(new PaperForPrinter(20, "PaperForPrinter"));

                for (Stationery stationeries : stationeryForPetr2) {

                    System.out.println(stationeries.getPrice() + " " + stationeries.getName());
                }
                break;

            case 3:
                Comparator<Stationery> compByNameAndPrice = new EmployeeSetComparatorByName().thenComparing(new EmployeeSetComparatorByPrice());

                TreeSet<Stationery> stationeryForPetr3 = new TreeSet(compByNameAndPrice);
                stationeryForPetr3.add(new Pen(10, "BluePen"));
                stationeryForPetr3.add(new Pencil(8, "SimplePencil"));
                stationeryForPetr3.add(new Eraser(8, "Eraser"));
                stationeryForPetr3.add(new Notebook(11, "SmallNotebook"));
                stationeryForPetr3.add(new PaperForPrinter(20, "PaperForPrinter"));

                for (Stationery stationeries : stationeryForPetr3) {

                    System.out.println(stationeries.getPrice() + " " + stationeries.getName());
                }

                break;

        }

    }

}
