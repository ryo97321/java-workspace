package kitasoft;

import java.io.*;

public class Ex3_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input: ");
        int x = Integer.parseInt(br.readLine());

        String msg = "";
        if (x == 0) {
            msg = "正の偶数";
        } else {
            if (x > 0) {
                if (x % 2 == 0) {
                    msg = "正の偶数";
                } else if (x % 2 == 1) {
                    msg = "正の奇数";
                }
            } else if (x < 0) {
                x *= -1;
                if (x % 2 == 0) {
                    msg = "負の偶数";
                } else if (x % 2 == 1) {
                    msg = "負の奇数";
                }
            }
        }

        System.out.printf("%s\n", msg);
    }
}