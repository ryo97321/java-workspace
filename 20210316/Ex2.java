import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] params = input.split(" ");

        int a = Integer.parseInt(params[0]);
        String symbol = params[1];
        int b = Integer.parseInt(params[2]);

        int ans = 0;
        int amari = 0;
        switch(symbol) {
            case "+":
                ans = a + b;
                break;
            case "-":
                ans = a - b;
                break;
            case "*":
                ans = a * b;
                break;
            case "/":
                ans = a / b;
                amari = a % b;
                break;
        }

        if (amari == 0) {
            System.out.println(ans);
        } else {
            System.out.printf("%d...%d\n", ans, amari);
        }
    }
}