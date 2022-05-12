public class home8 {
    public static void main(String[] args) {

//У вас есть 24 собаки и 8 котов. Порция обеда для каждого животного составляет 50 грамм и стоит 2 доллара. Животные кушают 3 раза в день.
//
//Сколько нужно корма для котов в месяц?
//
//Сколько нужно корма для собак в месяц?
//
//Сколько нужно денег в месяц на содержание приюта?


        int dog = 24;
        int cat = 8;
        int dinner = 50;
        int price = 2;


        int value1 = cat * dinner * 30 * 3;
        System.out.println("корма для котов в месяц: " + value1 + "gr");

        int value2 = dog * dinner * 30 * 3;
        System.out.println("корма для собак в месяц: " + value2 + "gr");

        int value3 = (cat+dog) * 30 * 3 * price;
        System.out.println("содержание приюта в месяц: " + value3 + "$");


    }
}
