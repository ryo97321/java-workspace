package kitasoft;

import java.io.*;

public class Ex3_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("mid-exam point: ");
        int mid_exam_point = Integer.parseInt(br.readLine());

        System.out.print("final-exam point: ");
        int final_exam_point = Integer.parseInt(br.readLine());

        int sum_point = mid_exam_point + final_exam_point;

        if (mid_exam_point >= 60 && final_exam_point >= 60) {
            System.out.println("合格");
        } else if (sum_point >= 130) {
            System.out.println("合格");
        } else if (sum_point >= 100 && (mid_exam_point >= 90 || final_exam_point >= 90)) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }
}