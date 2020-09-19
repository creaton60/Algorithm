package sort;

import org.junit.Assert;
import org.junit.Test;

public class NumberKTest {

    @Test
    public void test1_numberKTest() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        NumberK k = new NumberK();

        int[] returns = {5,6,3};

        int[] answer = k.solution(array, command);

        for(int i : answer) {
            System.out.println(i);
        }
    }
}
