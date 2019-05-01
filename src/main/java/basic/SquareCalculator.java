package basic;

import java.util.HashMap;
import java.util.Map;

/**
 * 사각형 만들기 마지막 좌표 찾는 문제
 *
 * Hash 로 풀이
 */
public class SquareCalculator {

    public int[] solution(int[][] v) {
        int[] answer = new int[2];

        Map<Integer, Integer> widthMap = new HashMap<>();

        Map<Integer, Integer> heightMap = new HashMap<>();

        for(int[] data : v) {
            int x = data[0];
            int y = data[1];

            widthMap.put(x, widthMap.getOrDefault(x, 0) + 1);

            heightMap.put(y, heightMap.getOrDefault(y, 0) +1);
        }

        for(int key : widthMap.keySet()) {
            if(widthMap.get(key) == 1) {
                answer[0] = key;
            }
        }

        for(int key : heightMap.keySet()) {
            if(heightMap.get(key) == 1) {
                answer[1] = key;
            }
        }

        return answer;
    }
}
