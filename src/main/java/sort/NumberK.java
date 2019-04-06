package sort;

import java.util.*;

/**
 * K 번째 수를 찾는 문제
 *
 * 처음에 괜히 List Integer 로 바꿔서 고생..
 *
 * 어설프게 List 나 Collection 쓰지말고
 *
 * 그냥 Array 쓰자, Array 로 왠만한거 다된다.
 *
 */
public class NumberK {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i= 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
