import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] params = input.split(" ");

        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);

        int sum = a + b;

        System.out.println(sum);
    }
}