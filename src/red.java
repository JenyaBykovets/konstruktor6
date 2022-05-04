public class red  {
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public static void main(String[] args) {

        System.out.println(calculate(4, 7, 3));

    }

    public static double calculate(long a,long b , long c){
        return (Math.abs(a-b))/(Math.pow((a+b),3)) - Math.sqrt(c);

    }
}



