public class air {

    public static void main(String[] args) {

        String a1 = "Jet";
        String a2 = "Airliner";
        String b1 = "F-22 Raptor";
        String b2 = "Aerobics 737";
        String b3 = "Boeing 777";

        int sum1 = 120;
        int sum2 = 180;
        int sum3 = 28;

        String Air1 = printAirplaneInfo(a1, b1);
        String Air2 = printAirplaneInfo(a2, b2, sum1);
        String Air3 = printAirplaneInfo(a2, b3, sum2, sum3);

        System.out.println("Тип самолета: " + Air1);
        System.out.println("Тип самолета: " + Air2 + ", колличество пасажиров эконом класса : " + sum1);
        System.out.println("Тип самолета: " + Air3 + ", колличество пасажиров эконом класса : " + sum2 + ", пассажиров бизнеc класса : " + sum3);

    }

    public static String printAirplaneInfo(String a, String b) {
        return a + ", модель : " + b;

    }

    public static String printAirplaneInfo(String a, String b, int c) {

        return a + ", модель : " + b;


    }

    public static String printAirplaneInfo(String a, String b, int c, int d) {

        return a + ", модель : " + b;
    }
 }








