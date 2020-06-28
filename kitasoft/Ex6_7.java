public class Ex6_7 {
    public static boolean is_prime(int n) {
        for(int i=2; i<(n/2)+1; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=10000; i<=10100; ++i) {
            if (is_prime(i)) {
                System.out.printf("%d ", i);
                System.out.println();
            }
        }
    }
}