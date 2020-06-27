public class Ex6_4 {
    public static void draw_triangle(int x) {
        for(int i=1; i<=x; i++) {
            for(int j=0; j<i; j++)
                System.out.print("$");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for(int i=3; i<=5; ++i) {
            draw_triangle(i);
            System.out.println();
        }
    }
}