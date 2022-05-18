import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class loto {
    public static void main(String[] args) throws IOException {
        System.out.println("Первый массив: ");
        int oneArr[] = new int[7];
        for (int i = 0; i < oneArr.length; i++) {
            oneArr[i] = (int) (Math.random() * 10);

            System.out.println(oneArr [i] + ","  );
        }
        System.out.println("Введите любую цифру , и нажмите Enter: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Arrays.sort(oneArr);
       int twoArr [] = new int [7];
       for (int i = 0; i < twoArr.length; i++) {
            twoArr[i] = Integer.parseInt(reader.readLine());
           System.out.println("Введите цифру: ");
        }
        Arrays.sort(twoArr);
        System.out.print(Arrays.toString(oneArr));
        System.out.println("");
        System.out.print(Arrays.toString(twoArr));

        if(oneArr[3] == twoArr[3]){
         System.out.println(" Excelent work");

         }else{
         System.out.println(" no repetitions");
     }
    }
    }


