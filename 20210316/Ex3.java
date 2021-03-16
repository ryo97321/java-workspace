import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] params = input.split(" ");

        int sum = 0;
        String symbol = "";

        for (int i=0; i<params.length; i++) {
            if (i == 0) {
                sum += Integer.parseInt(params[i]);
                continue;
            }

            if (i % 2 == 1) {
                symbol = params[i];
                
                switch(symbol) {
                    case "+":
                        sum += Integer.parseInt(params[i+1]);
                        break;
                    case "-":
                        sum -= Integer.parseInt(params[i+1]);
                        break;
                }
            }
        }

        System.out.println(sum);
    }
}
