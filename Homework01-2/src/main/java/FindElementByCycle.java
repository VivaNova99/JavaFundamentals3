import java.util.Scanner;

/**
 * Created by veraivanova on 27.08.16.
 */
public class FindElementByCycle {
    public static void main(String[] args) {

        System.out.println("Введите длину последовательности (например, 10)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Введите значение эпсилон (например, 0,02)");
        Scanner sce = new Scanner(System.in);
        double e = sce.nextDouble();

        double[] a = new double[n];

        int member = 0;

        for (int i = 1; i <= n; i++) {

            a[i-1] = 1/(double)((i+1)*(i+1));
            System.out.println(i + " элемент последовательности = " + a[i-1]);

            }

        for (int i=1; i <=n; i++) {
            if (1 / (double) ((i + 1) * (i + 1)) < e) {

                System.out.println("Наименьший элемент последовательности, при котором а[i] < e - " + i);
                member++;
                break;

            }

        }

        if (member == 0) {
            System.out.println("Все элементы последовательности больше эпсилон");
        }

    }

}
