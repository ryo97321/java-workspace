package kitasoft;

import java.io.*;

public class Ex3_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String msg_case1 = "";
        String msg_case2 = "";
        String msg_case3 = "";

        System.out.print("Point: ");
        int point = Integer.parseInt(br.readLine());

        // Case1
        if (point >= 60) {
            msg_case1 = "合格";
        } else if (point < 60) {
            msg_case1 = "不合格";
        }

        // Case2
        if (point >= 80) {
            msg_case2 = "たいへんよくできました";
        } else if (point >= 60) {
            msg_case2 = "よくできました";
        } else {
            msg_case2 = "ざんねんでした";
        }

        // Case3
        if (point >= 80) {
            msg_case3 = "優";
        } else if (point >= 70) {
            msg_case3 = "良";
        } else if (point >= 60) {
            msg_case3 = "可";
        } else {
            msg_case3 = "不可";
        }

        System.out.printf("case1: %s\n", msg_case1);
        System.out.printf("case2: %s\n", msg_case2);
        System.out.printf("case3: %s\n", msg_case3);
    }
}