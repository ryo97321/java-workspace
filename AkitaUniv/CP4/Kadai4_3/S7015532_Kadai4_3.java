import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import S7015532_conversion.S7015532_LengthConversion;

public class S7015532_Kadai4_3 {
    public static void main(String[] args) {
        S7015532_LengthConversion lc = new S7015532_LengthConversion();

        double km = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("’·‚³[km] : ");
        try {
            km = Double.parseDouble(br.readLine());
        } catch(IOException e) {
            System.out.println(e);
        }

        double mile = lc.getMile(km);
        double yard = lc.getYard(km);

        System.out.println(km + " [km] = " + mile + " [mile]");
        System.out.println(km + " [km] = " + yard + " [yard]");
    }
}