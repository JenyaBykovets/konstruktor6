import java.util.Random;
public class Password {

    public String getPassword(int size) {
        StringBuilder b = new StringBuilder();
        Random r = new Random();
        for(int i =0; i < size; i ++)
            b.append((char)(r.nextInt(10) + 'a' ));
        return b.toString();
    }

    public static void main(String[] args) {
        Password password = new Password();
        System.out.println(password.getPassword(8));


    }
}


