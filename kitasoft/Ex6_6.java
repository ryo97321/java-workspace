public class Ex6_6 {
    public static void show_kuku(int n) {
        for(int i=1; i<=9; ++i)
            System.out.printf(" %2d", n*i);
        System.out.println();
    }

    public static void main(String[] args) {
        for(int i=1; i<=9; ++i)
            show_kuku(i);
    }
}