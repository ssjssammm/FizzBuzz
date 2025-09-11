package lab1;

public class Multiples {
    public static void main(String[] arg) {
        int count = multiples();
        System.out.println(count);
    }

    private static int multiples() {
        int i;
        int count = 0;
        for (i=1; i<1000; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                count +=1;
            }
        }
        return count;
    }
}
