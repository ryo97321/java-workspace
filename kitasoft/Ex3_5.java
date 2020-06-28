package kitasoft;

import java.io.*;

public class Ex3_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input: ");
        int x = Integer.parseInt(br.readLine());

        if (x % 2 == 0) {
            System.out.println("偶数");
        } else if (x % 2 == 1) {
            System.out.println("奇数");
        }
    }
}