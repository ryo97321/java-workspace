import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] params = input.split(" ");

        int sum = calc(params, 0, params.length-1);
        System.out.println(sum);
    }

    public static int calc(String[] params, int startIdx, int endIdx) {
        int sum = 0;
        String type = null;
        for (int i=startIdx; i<endIdx+1; i++) {
            if (params[i].equals("+") || params[i].equals("-")) {
                type = params[i];
            } else if (params[i].equals("(")) {
                int endOfFormula = checkEndOfFormula(params, i);
                if (type != null) {
                    if (type.equals("+")) {
                        sum = sum + calc(params, i+1, endOfFormula-1);
                    } else if (type.equals("-")) {
                        sum = sum - calc(params, i+1, endOfFormula-1);
                    }
                } else {
                    sum = calc(params, i+1, endOfFormula-1);
                }
                i = endOfFormula;
            } else {
                int num = Integer.parseInt(params[i]);
                if (type != null) {
                    if (type.equals("+")) {
                        sum = sum + num;
                    } else if (type.equals("-")) {
                        sum = sum - num;
                    }
                } else {
                    sum = num;
                }
            }
        }
        return sum;
    }

    public static int checkEndOfFormula(String[] params, int startIdx) {
        int end = startIdx + 1;
        int startCount = 0;
        for(int i = startIdx+1; i<params.length; i++) {
            end = i;
            if(params[i].equals("(")) {
                startCount++;
            } else {
                if(startCount == 0) {
                    break;
                } else {
                    startCount--;
                }
            }
        }
        return end;
    }
}