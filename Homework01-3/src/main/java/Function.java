import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by veraivanova on 31.08.16.
 */
public class Function {
    public static void main(String[] args) {

        System.out.println("Введите 'a'(double) - начальное значение отрезка");
        Scanner sca = new Scanner(System.in);
        double a = sca.nextDouble();

        System.out.println("Введите 'b'(double) - конечное значение отрезка");
        Scanner scb = new Scanner(System.in);
        double b = scb.nextDouble();

        System.out.println("Введите шаг 'n'(double)");
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();


        for (double x = a; x <= b; x += n) {

            double f = tan(2*x)-3;
            System.out.printf("| %f \t  | %f \t | \n", x, f);
            System.out.println("|_____________|______________|");
        }


    }
}
