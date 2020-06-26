import S7015532_calcarea.S7015532_Triangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import S7015532_calcarea.S7015532_Rectangle;

public class S7015532_Kadai4_4 {
    public static void main(String[] args) {
        S7015532_Triangle tri = new S7015532_Triangle();
        S7015532_Rectangle rec = new S7015532_Rectangle();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("�O�p�`�̖ʐς��v�Z");
        System.out.print("��ӂ̒��� : ");
        try {
            double base = Double.parseDouble(br.readLine());
            System.out.print("���� : ");
            double height = Double.parseDouble(br.readLine());
            System.out.println("�O�p�`�̖ʐ� : " + tri.getArea(base, height));
        } catch(IOException e) {
            System.out.println(e);
        }

        System.out.println("");

        System.out.println("�l�p�`�̖ʐς��v�Z");
        System.out.print("���̒��� : ");
        try {
            double yoko = Double.parseDouble(br.readLine());
            System.out.print("�c�̒��� : ");
            double tate = Double.parseDouble(br.readLine());
            System.out.println("�l�p�`�̖ʐ� : " + rec.getArea(yoko, tate));
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}