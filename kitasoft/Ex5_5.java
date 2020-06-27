import java.io.*;

public class Ex5_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());

        int[] binary = new int[16];

        int quot = 0;   // 商
        int rem = 0;    // 余り

        int i_binary = 0;
        while(quot != 1) {
            quot = value / 2;
            rem = value % 2;
            value /= 2;
            binary[i_binary] = rem;
            i_binary++;
        }
        binary[i_binary] = quot;

        for(int i=binary.length-1; i>=0; --i)
            System.out.printf("%d", binary[i]);
    }
}