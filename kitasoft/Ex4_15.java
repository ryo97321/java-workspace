package kitasoft;

import java.io.*;

public class Ex4_15 {
    public static boolean is_prime(int n) {
        for(int i=2; i<=(n/2)+1; i++) {
            if (n % 2 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (is_prime(n)) {
            System.out.println("素数です");
        } else {
            System.out.println("素数ではありません");
        }
    }
}