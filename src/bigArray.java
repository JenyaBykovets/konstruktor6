import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bigArray {
    public static void main(String[] args) throws IOException {
        int[] bigArr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = Integer.parseInt(reader.readLine());
        }
        arr1 = Arrays.copyOfRange(bigArr, 0, 9);
        arr2 = Arrays.copyOfRange(bigArr, 10, 20);

    }
}