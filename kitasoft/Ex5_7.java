import java.io.*;

public class Ex5_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        for(int i=0; i<10; ++i) {
            System.out.printf("%d : ", i+1);
            int n = Integer.parseInt(br.readLine());
            numbers[i] = n;
        }

        boolean sorted_flag = true;     // 一度でもソートしたらtrue

        // bubble sort
        while(sorted_flag) {
            sorted_flag = false;
            for(int i=0; i<numbers.length-1; ++i) {
                for(int j=i; j<numbers.length-1; ++j) {
                    if(numbers[j] > numbers[j+1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;
                        sorted_flag = true;
                    }
                }
            }
        }

        for(int i=0; i<numbers.length; ++i)
            System.out.printf("%d ", numbers[i]);
        System.out.println();
    }
}