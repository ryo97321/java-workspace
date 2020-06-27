public class Ex6_1 {
    public static int num_pow(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int x = 10;
        int result = num_pow(x);

        System.out.printf("x : %d\n", result);
    }
}