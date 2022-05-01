public class math {
    public static void main(String[] args) {
        //сложения двух чисел
        int a = 15;
        int b = 7;
        int c = a + b;
        int d = 6 + b;
        System.out.println("сложения двух чисел: " + d);
        System.out.println( "сложения двух чисел: " +c);

        //вычитания двух чисел
        int q = 15;
        int w = 7;
        int e = q - w;
        int r = 6 - q;
        System.out.println("вычитания двух чисел: " + e);
        System.out.println("вычитания двух чисел: " + r);

        // умножения двух чисел
        int t = 12;
        int y = 5;
        int u = t * y;
        int i = y * 7;

        System.out.println("умножения двух чисел: " + u);
        System.out.println("умножения двух чисел: " + i);

        //деления двух чисел
        int s = 20;
        int f = 5;
        int g = s / f;
        double k = 22.5 / 4.5;
        System.out.println("деления двух чисел: " + g);
        System.out.println("деления двух чисел: " + k);

        double n = 10/3;
        System.out.println(n);

        double l = 10.0/3;
        System.out.println(l);

        // остатка от деления двух чисел
        int a1 = 33;
        int b1 = 5;
        int c1 = a1 % b1;
        int d1 = 22 % 4;
        System.out.println(" остатка от деления двух чисел: " + c1);
        System.out.println(" остатка от деления двух чисел: " +d1);


        //префиксный инкремент
        int a2 = 2;
        int b2 = ++a2;
        System.out.println("префиксный инкремент: " + a2);
        System.out.println( "префиксный инкремент: " + b2);

        //постфиксный инкремент
        int a3 = 3;
        int b3 = a3++;
        System.out.println( "постфиксный инкремент: " + a3);
        System.out.println( "постфиксный инкремент: " + b3);

        //префиксный декремент
        int a4 = 4;
        int b4 = --a4;
        System.out.println("префиксный декремент: " + a4);
        System.out.println( "префиксный декремент: " + b4);


        //постфиксный декремент
        int a5 = 7;
        int b5 = a5--;
        System.out.println( "постфиксный декремент: " + a5);
        System.out.println( "постфиксный декремент: " + b5);

        //приоритет выполнения
        int a6 = 6;
        int b6 = 7;
        int c6 = a6 + 5 * ++b6;
        System.out.println("приоритет выполнения: " + c6);

        int a7 = 9;
        int b7 = 9;
        int c7 = (a7 + 5) * ++b7;
        System.out.println("приоритет выполнения: " + c7);








    }
}
