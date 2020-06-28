package kitasoft;

import java.io.*;

public class Ex2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input : ");
        int x = Integer.parseInt(br.readLine());

        System.out.printf("x = %d\n", x);
    }
}