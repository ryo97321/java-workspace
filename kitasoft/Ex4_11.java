package kitasoft;

import java.io.*;

public class Ex4_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            System.out.printf("%d", i%10);
        }
    }
}