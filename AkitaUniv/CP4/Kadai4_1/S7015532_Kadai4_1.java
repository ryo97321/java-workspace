import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class S7015532_Kadai4_1 {

    public static double getPoint2(double number) {
        number *= 100.0;
        number = Math.round(number);
        number /= 100.0;
        return number;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double pi = 3.1415926;
        double tyokkei = 1;
        double r;
        double area;

        System.out.print("â~ÇÃíºåa : ");
        try {
            tyokkei = Double.parseDouble(br.readLine());
        } catch(IOException e) {
            System.out.println(e);
        }

        r = tyokkei / 2.0;
        area = pi * Math.pow(r, 2);

        System.out.println("â~ÇÃñ êœ : " + getPoint2(area));
    }
}