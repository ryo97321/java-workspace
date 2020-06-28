package kitasoft;

import java.io.*;

public class Ex2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input : ");
        int x = Integer.parseInt(br.readLine());

        System.out.printf("x**1 = %d\n", x);
        System.out.printf("x**2 = %d\n", x*x);
        System.out.printf("x**3 = %d\n", x*x*x);
    }
}