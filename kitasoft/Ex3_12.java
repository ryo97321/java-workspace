package kitasoft;

import java.io.*;

public class Ex3_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("1: まぐろ, 2: えび, 3: こはだ : ");
        int n = Integer.parseInt(br.readLine());

        switch (n) {
            case 1:
                System.out.println("MAGURO");
                break;
            case 2:
                System.out.println("EBI");
                break;
            case 3:
                System.out.println("KOHADA");
                break;
        }
    }
}