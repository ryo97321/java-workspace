import java.io.*;

public class Ex5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        for(int i=0; i<10; i++) {
            System.out.printf("%d : ", i+1);
            int n = Integer.parseInt(br.readLine());
            numbers[i] = n;
        }

        System.out.println();
        for(int i=0; i<10; i++)
            System.out.printf("%d : %d\n", i, numbers[i]);
    }
}