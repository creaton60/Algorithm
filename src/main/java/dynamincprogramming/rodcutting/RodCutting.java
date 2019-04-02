package dynamincprogramming.rodcutting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RodCutting {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] partPrice = new int[num + 1];
        int[] maxPricePerLength = new int[num + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= num; i++) {
            partPrice[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        for (int i = 1; i <= num; i++) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                max = Math.max(max, partPrice[j] + maxPricePerLength[i-j]);
            }
            maxPricePerLength[i] = max;
        }

        System.out.println(maxPricePerLength[num]);
    }
}
