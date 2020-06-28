package kitasoft;

import java.io.*;

public class Ex3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("x: ");
        int x = Integer.parseInt(br.readLine());
        
        System.out.print("y: ");
        int y = Integer.parseInt(br.readLine());

        if (x > y) {
            System.out.println("xはyよりも大きい");
        } else if (x < y) {
            System.out.println("xはyよりも小さい");
        }
    }
}