package kitasoft;

import java.io.*;

public class Ex4_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=0;
        int sum = 0;
        for(int i=0; i<10; i++) {
            System.out.printf("%d : ", i+1);
            n = Integer.parseInt(br.readLine());
            sum += n;
        }

        int average = sum / 10;
        System.out.printf("average: %d\n", average);
    }
}