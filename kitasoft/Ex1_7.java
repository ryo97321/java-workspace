package kitasoft;

public class Ex1_7 {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;

        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.printf("x=%d,y=%d\n", x, y);
    }
}