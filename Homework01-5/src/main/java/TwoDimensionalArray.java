import java.util.Scanner;

/**
 * Created by veraivanova on 03.09.16.
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {

        System.out.println("Введите 'n' - размер массива");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){

                if (i == j)
                    a[i][j] = 1;

                else if ((n-(i+1)) == j)
                    a[i][j] = 1;

                else a [i][j] = 0;

                System.out.print(a[i][j] + "\t");
            }

            System.out.println();

        }

    }
}
