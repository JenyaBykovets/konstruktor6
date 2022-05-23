import java.util.Random;

public class Home11 {

    public static void main(String[] args) {

            int arraySize = 3, temp = 0;
            int[][] array = new int[arraySize][arraySize];
            Random newRandomNumber = new Random();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = newRandomNumber.nextInt(5) + -10;
                    System.out.printf("%d      ", array[i][j]);
                }
                System.out.println();

                    }


            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {

                    if (array[i][j] > 0) {
                        System.out.printf("%d%d,  ", i, j);
                    }
                }
            }


        }

    }
