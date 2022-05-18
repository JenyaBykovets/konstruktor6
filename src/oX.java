import java.util.Arrays;
public class oX {
    public static void main(String[] args) {

        int[] numbers = new int[]{5,4,4,0,0,3,2,1,6,0,0,0,0,3,4,5,2};
        int a  = numbers.length - 1;
        Arrays.sort(numbers);
        for (int i = a - 1; i <= 0; i++) {
           if (numbers[i] == 0) {
           }
        }
        for (int i : numbers) {
            System.out.print(i + ", ");
        }
    }
}

