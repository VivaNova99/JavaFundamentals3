import java.util.Scanner;

/**
 * Created by veraivanova on 03.09.16.
 */
public class DimensionalArray {
    public static void main(String[] args) {

        System.out.println("Введите 'n' - длину последовательности");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[2*n];
        int max = 0;

        for (int i=1; i <= 2*n; i++) {

            a[i-1] = i;

//            System.out.println("a["+(i)+"] = "+a[i]);

        }

        for (int i = 1; i <= n; i++) {

            int element = a[i-1] + a[2*n-i];
            if (max < element)
                max = element;

        }

        System.out.println("Наибольший элемент в последовательности = " + max);
    }
}
