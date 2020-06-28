public class Ex6_5 {
    public static void draw_triangle(int triangle_size, char triangle_c) {
        System.out.println();
        for(int i=1; i<=triangle_size; ++i) {
            for(int j=0; j<i; ++j)
                System.out.printf("%c", triangle_c);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        draw_triangle(5, 's');
    }
}