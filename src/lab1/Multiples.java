package lab1;

public class Multiples {
    public static void main(String[] arg) {
      //multiples(1000, 5, 3)
    }
    public static int multiples(){
        return multiples(1000, 5, 3);
    }

     static int multiples(int a, int b, int n) {
        int i;
        int count = 0;
        for (i=1; i < a; i++) {
            if (i % b == 0 || i % n == 0){
                count +=1;
            }
        }
        return count;
    }
}
