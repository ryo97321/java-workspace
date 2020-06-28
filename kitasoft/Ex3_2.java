package kitasoft;

import java.io.*;

public class Ex3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("x: ");
        int x = Integer.parseInt(br.readLine());
        
        System.out.print("y: ");
        int y = Integer.parseInt(br.readLine());

        int larger_number = 0;
        if (x > y) {
            larger_number = x;
        } else if (x < y) {
            larger_number = y;
        }

        System.out.printf("larger number: %d\n", larger_number);
    }
}