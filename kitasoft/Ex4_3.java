package kitasoft;

public class Ex4_3 {
    public static void main(String[] args) {
        double n = 2.0;

        for (int i=1; i<=8; i++) {
            System.out.printf("2 ** %d = %d\n", i, (int)Math.pow(n, (double)i));
        }
    }
}