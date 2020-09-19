package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 두개의 배열을 병합한 후에
 *
 * 지정한 K 번째의 수를 찾는 문제
 *
 * 단, API 에서 제공해주는 sort 함수 사용 금지.
 *
 * 직접 sort 를 만들어서 작성
 */
public class MergeArrayNumberK {

    private static String[] inputs = new String[5];


    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i=0;

        while(i < 5) {
            String input = br.readLine();

            inputs[i] = input;

            i++;
        }

        br.close();

        taskInputData(inputs);
    }

    public static void taskInputData(String[] inputs) {

        int num = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[2]);

        StringTokenizer array1 = new StringTokenizer(inputs[1], " "); //firstArray;

        StringTokenizer array2 = new StringTokenizer(inputs[3], " "); //secondArray;

        int index = Integer.parseInt(inputs[4]);

        int[] array = new int[num];

        int i =0;

        while (array1.hasMoreTokens()) {

            array[i] = Integer.parseInt(array1.nextToken());

            i++;
        }

        while(array2.hasMoreTokens()) {
            array[i] = Integer.parseInt(array2.nextToken());

            i++;
        }

        System.out.println(findNumber(array, index));
    }


    public static int findNumber(int[] array, int command) {
        sort(array);

        printArray(array);

        return array[command-1];
    }

    public static int[] sort(int[] array) {

        taskSort(array, 0, array.length -1);

        return array;
    }

    public static void taskSort(int[] array, int left, int right) {
        if(left < right) {
            int pivot = partition(array, left, right);

            taskSort(array, left, pivot -1);
            taskSort(array, pivot, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int mid = (left + right) /2;

        int pivot = array[mid];

        while(left <= right) {
            while(less(array[left], pivot)) {
                ++left;
            }

            while(less(pivot, array[right])) {
                --right;
            }

            if(left <= right) {
                swap(array, left, right);
                ++left;
                --right;
            }
        }

        return left;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static boolean swap(int[] array, int x, int y) {
        int swap = array[x];

        array[x] = array[y];
        array[y] = swap;

        return true;
    }

    public static <T extends Comparable<T>> boolean less(T x, T y) {
        return x.compareTo(y) < 0;
    }
}
