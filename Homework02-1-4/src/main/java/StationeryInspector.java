/**
 * Created by veraivanova on 18.10.16.
 */
public class StationeryInspector {
    public static void main(String[] args) {

        EmployeeSet employeeSetForInspection = new EmployeeSet();

        System.out.print("На столе у сотрудника находятся: ");
        for (Stationery stationeries : employeeSetForInspection.getStationeriesForOlga()) {
            System.out.print(stationeries.getName() + ", ");
        }
        System.out.println();
        System.out.print("Общая стоимость канцтоваров на столе у сотрудника: ");
        int sum = 0;
        for (Stationery stationeries : employeeSetForInspection.getStationeriesForOlga()) {
            sum += stationeries.getPrice();
        }
        System.out.println(sum);
    }
}
