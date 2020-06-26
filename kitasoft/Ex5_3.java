import java.io.*;
import java.util.ArrayList;

public class Ex5_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        for(int i=0; i<10; ++i) {
            System.out.printf("%d : ", i+1);
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 0) {
                evens.add(n);
            } else if (n % 2 == 1) {
                odds.add(n);
            }
        }

        System.out.println();
        System.out.print("偶数 : ");
        for(int i=0; i<evens.size(); ++i)
            System.out.printf("%d ", evens.get(i));
            
        System.out.println();
        System.out.print("奇数 : ");
        for(int i=0; i<odds.size(); ++i)
            System.out.printf("%d ", odds.get(i));
    }
}