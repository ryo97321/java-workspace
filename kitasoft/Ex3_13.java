package kitasoft;

import java.io.*;

public class Ex3_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("month : ");
        int month = Integer.parseInt(br.readLine());
        int n_date = 0;

        if (month < 1 || month > 12) {
            System.out.println("入力が間違っています");
        } else {
            switch (month) {
                case 1:
                    n_date = 31;
                    break;
                case 2:
                    n_date = 28;
                    break;
                case 3:
                    n_date = 31;
                    break;
                case 4:
                    n_date = 30;
                    break;
                case 5:
                    n_date = 31;
                    break;
                case 6:
                    n_date = 30;
                    break;
                case 7:
                    n_date = 31;
                    break;
                case 8:
                    n_date = 31;
                    break;
                case 9:
                    n_date = 30;
                    break;
                case 10:
                    n_date = 31;
                    break;
                case 11:
                    n_date = 30;
                    break;
                case 12:
                    n_date = 31;
                    break;
            }
            System.out.printf("日数は %d 日です\n", n_date);
        }
    }
}