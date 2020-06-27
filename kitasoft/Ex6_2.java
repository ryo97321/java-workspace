public class Ex6_2 {
    public static int get_average(int x, int y) {
        return (x + y) / 2;
    }
    
    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        int avg = get_average(x, y);

        System.out.printf("average: %d\n", avg);
    }
}