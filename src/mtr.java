import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mtr {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n* i+j;
            }
        }
        System.out.println("M");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("N");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }

    }
}

