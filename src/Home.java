public class Home {

    public String color;
    public String street;
    public Integer number;
    public Integer floors;
    public Integer rooms;

    // static
public static int date = (14);
public static String day = "Monday";

    public Home(String color, String street, Integer number, Integer floors, Integer rooms) {
        this.color = color;
        this.street = street;
        this.number = number;
        this.floors = floors;
        this.rooms = rooms;
    }


    @Override
    public String toString() {
        return "Home{" +
                "color='" + color + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", floors=" + floors +
                ", rooms=" + rooms +
                '}';
    }

    public String toString(String color) {
        return "Homecolor{" +
                "color='" + color + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", floors=" + floors +
                ", rooms=" + rooms +
                '}';
    }


    public static void main(String[] args) {
        Home home1 = new Home("yellow", "Severnaya", 12, 2, 5);
        Home home2 = new Home("red", "Stolbova", 43, 1, 3);
        System.out.println(home1.toString());
        System.out.println(home2.toString("green"));
        //
        System.out.println(day + " " + date);
    }
}


