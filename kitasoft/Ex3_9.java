package kitasoft;

import java.io.*;

public class Ex3_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(">0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜 : ");
        int day = Integer.parseInt(br.readLine());      // 曜日

        System.out.print(">0=午前、1=午後、2=夜間 : ");
        int time = Integer.parseInt(br.readLine());

        int[][] schedule = new int[3][7];       // 開いていれば1, 休診なら0

        // 1で初期化
        for (int i=0; i<3; i++) {
            for(int j=0; j<7; j++) {
                schedule[i][j] = 1;
            }
        }

        // 休診日をチェック
        schedule[0][0] = 0;
        schedule[0][2] = 0;
        schedule[0][5] = 0;
        schedule[1][0] = 0;
        schedule[1][6] = 0;
        schedule[2][0] = 0;
        schedule[2][3] = 0;
        schedule[2][6] = 0;

        if (schedule[time][day] == 0) {
            System.out.println("休診です");
        } else if (schedule[time][day] == 1) {
            System.out.println("開いています");
        }
    }
}