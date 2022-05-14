import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class generateArr {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[Integer.parseInt(reader.readLine())];

        for (int i = 1; i < arr.length; i++) {
            Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(arr));

        boolean a = true;
        for (int i = 1;i< arr.length; i++) {
            if(arr[i]<=arr[i-1]){
                a = false;
                break;
            }
        }
        if(a){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
