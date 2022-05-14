public class Arr {

    public Boolean vozvrat (String A){

        String B = "";
        String C = A.replace(" ","");
        char[] a1 =C.toCharArray();
       char[] a2=new char[a1.length];
        for ( int i =a1.length-1; i>= 0;){
            for(int j = 0;j < a2.length; j++){

                a2[j]=a1[i]; i--;

                B+=a2[j];

            }

        }
        System.out.println(B);
        System.out.println(C);
        return B.equalsIgnoreCase(C);

    }

    public static void main(String args[]){
        Arr C = new Arr();
        System.out.println(C.vozvrat("А роза упала на лапу азора"));
    }

}