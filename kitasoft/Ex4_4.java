package kitasoft;

public class Ex4_4 {
    public static void main(String[] args) {
        int num = 1;

        for(int i=7; i>=1; i--) {
            num *= i;
        }

        System.out.printf("7! = %d", num);
    }
}