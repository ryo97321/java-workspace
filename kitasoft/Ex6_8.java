public class Ex6_8 {
    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return Fibonacci(n-2) + Fibonacci(n-1);
    }

    public static void main(String[] args) {
        for(int n=11; n<=20; ++n) {
            System.out.printf("%d ", Fibonacci(n));
        }
    }
}