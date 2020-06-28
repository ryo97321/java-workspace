package kitasoft;

import java.io.*;

public class Ex2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("x : ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("y : ");
        int y = Integer.parseInt(br.readLine());

        System.out.printf("x + y = %d\n", x+y);
        System.out.printf("x - y = %d\n", x-y);
        System.out.printf("x * y = %d\n", x*y);
        System.out.printf("x / y = %d\n", x/y);
        System.out.printf("x %% y = %d\n", x%y);
    }
}