package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 동전 뒤집기 문제
 *
 * 비트 연산으로 풀어보려고 시도 했다가 실패..
 *
 * 다른 방법 고민
 */
public class CoinReverse {

    private static List<List<Integer>> list = new ArrayList<>();

    private static List<String> resultList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        list.add(input(input));

        reverse();

        for(String data : resultList) {
            System.out.println(data);
        }

        br.close();
    }

    public static List<Integer> input(String input) {

        String[] tokens = input.split(",");

        char[] array = tokens[0].toCharArray();

        List<Integer> inputs = new ArrayList<>();

        for (char c : array) {
            if (c == 'H') {
                inputs.add(0);
            } else if (c == 'T') {
                inputs.add(1);
            }
        }

        return inputs;
    }

    public static void reverse() {
        for(List<Integer> dataList : list) {
            int sum = dataList.stream().reduce(0, (a, b) -> a + b);

            if(sum == 0) {
                resultList.add(String.valueOf(0));
            }
        }
    }
}
