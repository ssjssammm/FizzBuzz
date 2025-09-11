package lab1;

public class Multiples {
    public static void main(String[] arg) {
       int i;
       int count = 0;
       for (i=0; i<1000; i++) {
           if (i % 3 == 0 || i % 5 == 0){
               count ++;
           }
       }
       System.out.println(count);
    }
}
