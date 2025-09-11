package lab1;

public class Multiples {
    public static void main(String[] arg) {
    }

     static int multiples(int a, int b, int n) {
        int i;
        int count = 0;
        for (i=1; i < n; i++) {
            if (i % a == 0 || i % b == 0){
                count +=1;
            }
        }
        return count;
    }
}
