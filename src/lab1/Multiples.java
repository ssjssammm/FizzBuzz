package lab1;

public class Multiples {
    public static void main(String[] arg) {
        int count = multiples();
        System.out.println(count);
    }
    public static int multiples(){
        return multiples(1000,3 ,5);
    }

     static int multiples(int n, int a, int b) {
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
