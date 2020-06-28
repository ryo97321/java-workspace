package kitasoft;

import java.io.*;

public class Ex2_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("x : ");
        int x = Integer.parseInt(br.readLine());
        System.out.printf("y : ");
        int y = Integer.parseInt(br.readLine());

        System.out.printf("Average: %d\n", (x + y) / 2);
    }    
}