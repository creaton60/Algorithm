package dynamicprogramming.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Long> map = new HashMap<>();

    private static final int num =60;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int i= Integer.parseInt(input);

        int[] array = new int[i];

        for(int j=0; j< array.length; j++) {
            array[j] = Integer.parseInt(br.readLine());
        }

        br.close();

        createFib(num);

        printArray(findNextNum(array));
    }

    public static long[] findNextNum(int[] array) {
        long[] answers = new long[array.length];

        for(int i=0; i < answers.length; i++) {
            for(int key : map.keySet()) {
                if(map.get(key) > array[i]) {
                    answers[i] = map.get(key);

                    break;
                }
            }
        }

        return answers;
    }

    public static void printArray(long[] array) {
        for(long data : array) {
            System.out.println(data);
        }
    }

    public static long createFib(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }

        long f;

        if (n <= 1) {
            f = n;
        } else {
            f = createFib(n - 1) + createFib(n - 2);
            map.put(n, f);
        }
        return f;
    }
}
