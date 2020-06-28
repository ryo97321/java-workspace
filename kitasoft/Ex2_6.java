package kitasoft;

import java.io.*;

public class Ex2_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.printf("days: %d\n", age*365);
    }
}