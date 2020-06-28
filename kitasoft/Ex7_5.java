import java.io.*;

class CoinCase {
    private int n_500 = 0;
    private int n_100 = 0;
    private int n_50 = 0;
    private int n_10 = 0;
    private int n_5 = 0;
    private int n_1 = 0;

    public void AddCoins(int coin_type, int n_coin) {
        switch (coin_type) {
            case 500:
                this.n_500 += n_coin;
                break;
            case 100:
                this.n_100 += n_coin;
                break;
            case 50:
                this.n_50 += n_coin;
                break;
            case 10:
                this.n_10 += n_coin;
                break;
            case 5:
                this.n_5 += n_coin;
                break;
            case 1:
                this.n_1 += n_coin;
                break;
            default:
                System.out.println("value is error.");
                break;
        }
    }

    public int GetCount(int coin_type) {
        int n_coin = 0;
        switch (coin_type) {
            case 500:
                n_coin = n_500;
                break;
            case 100:
                n_coin = n_100;
                break;
            case 50:
                n_coin = n_50;
                break;
            case 10:
                n_coin = n_10;
                break;
            case 5:
                n_coin = n_5;
                break;
            case 1:
                n_coin = n_1;
                break;
            default:
                System.out.println("value is error");
                break;
        }

        return n_coin;
    }

    public int GetAmount() {
        return 500*n_500 + 100*n_100 + 50*n_50 + 10*n_10 + 5*n_5 + 1*n_1;
    }
}

public class Ex7_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        CoinCase coincase = new CoinCase();

        int coin_type = 0;
        int n_coin = 0;
        for(int i=0; i<10; ++i) {
            System.out.printf("%d.\n", i+1);
            System.out.print("coin type : ");
            coin_type = Integer.parseInt(br.readLine());
            System.out.print("n coin : ");
            n_coin = Integer.parseInt(br.readLine());
            coincase.AddCoins(coin_type, n_coin);

            System.out.println();
        }

        int[] coin_types = {500, 100, 50, 10, 5, 1};
        for(int i=0; i<coin_types.length; ++i)
            System.out.printf(" %3d : %2d\n", coin_types[i], coincase.GetCount(coin_types[i]));
        System.out.println();
        
        int amount = coincase.GetAmount();
        System.out.printf("Amount : %d\n", amount);
    }
}