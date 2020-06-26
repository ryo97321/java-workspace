import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import Kadai4_3.S7015532_conversion.S7015532_PiRad;
import Kadai4_4.S7015532_calcarea.S7015532_Circle;

public class S7015532_Kadai4_5 {

    public static double getPoint2(double number) {
        number *= 100.0;
        number = Math.round(number);
        number /= 100.0;
        return number;
    }

    public static void main(String[] args) {
        S7015532_PiRad piRad = new S7015532_PiRad();
        S7015532_Circle circle = new S7015532_Circle();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double rad = 0.0;
        System.out.print("角度（度）: ");
        try {
            double kakudo = Double.parseDouble(br.readLine());
            rad = piRad.getRad(kakudo);
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("ラジアン : " + getPoint2(rad));

        double r = 0.0;
        System.out.print("半径 : ");
        try {
            r = Double.parseDouble(br.readLine());
        } catch(IOException e) {
            System.out.println(e);
        }

        double area = circle.getArea(rad, r);
        System.out.println("扇形の面積 : " + getPoint2(area));
    }
}