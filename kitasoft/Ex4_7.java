package kitasoft;

import java.io.*;

public class Ex4_7 {
    public static void main(String[] args) throws IOException {
        // int[top(0) or bottom(1)][number of inning]
        // top -> 巨人, bottom -> 阪神
        int[][] scoreboard = new int[2][9];

        // 0で初期化
        for (int j=0; j<9; j++) {
            for (int i=0; i<2; i++) {
                scoreboard[i][j] = 0;
            }
        }

        int score = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int j=0; j<9; j++) {
            for (int i=0; i<2; i++) {
                if (i == 0) {
                    System.out.printf("%d回表、巨人の得点は？ ", j+1);
                } else if (i == 1) {
                    System.out.printf("%d回裏、阪神の得点は？ ", j+1);
                }
                score = Integer.parseInt(br.readLine());
                scoreboard[i][j] = score;
            }
        }

        int total_score_kyojin = 0;
        int total_score_hansin = 0;

        for(int i=0; i<2; i++) {
            if (i == 0) {
                for(int j=0; j<9; j++)
                    total_score_kyojin += scoreboard[i][j];
            } else if (i == 1) {
                for(int j=0; j<9; j++)
                    total_score_hansin += scoreboard[i][j];
            }
        }

        System.out.println();
        System.out.printf("巨人 : %d点, 阪神 : %d点\n", total_score_kyojin, total_score_hansin);

        if (total_score_hansin > total_score_kyojin) {
            System.out.println("阪神の勝ち");
        } else {
            System.out.println("巨人の勝ち");
        }
    }
}