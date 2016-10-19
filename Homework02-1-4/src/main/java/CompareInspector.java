
import java.util.Scanner;


/**
 * Created by veraivanova on 18.10.16.
 */
public class CompareInspector {

    public static void main(String[] args) {

        System.out.println("Введите '1', чтобы сортировать по названию; \n"  +
                "Введите '2', чтобы сортировать по цене; \n" +
                "Введите '3', чтобы сортировать сперва по названию, затем по цене");

        int choice;
        Scanner MyChoice = new Scanner(System.in);
        choice = MyChoice.nextInt();

        EmployeeSet employeeSetSortedByName = new EmployeeSet();
        EmployeeSet employeeSetSortedByPrice = new EmployeeSet();
        EmployeeSet employeeSetSortedByNameAndPrice = new EmployeeSet();


        switch (choice) {

            case 1:

                employeeSetSortedByName.getStationeriesForOlgaByName();

                for (Stationery stationeries : employeeSetSortedByName.getStationeriesForOlgaByName()) {

                    System.out.println(stationeries.getPrice() + " " + stationeries.getName());
                }

                break;

            case 2:

                employeeSetSortedByPrice.getStationeriesForOlgaByPrice();

                for (Stationery stationeries : employeeSetSortedByPrice.getStationeriesForOlgaByPrice()) {

                    System.out.println(stationeries.getPrice() + " " + stationeries.getName());
                }

                break;

            case 3:

                employeeSetSortedByNameAndPrice.getStationeriesForOlgaByNameAndPrice();

                for (Stationery stationeries : employeeSetSortedByNameAndPrice.getStationeriesForOlgaByNameAndPrice()) {

                    System.out.println(stationeries.getPrice() + " " + stationeries.getName());
                }

                break;

        }

    }

}
