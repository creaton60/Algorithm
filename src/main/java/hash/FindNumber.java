package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 없는 숫자 찾기 문제
 *
 * 해시로 풀음
 */
public class FindNumber {
    public int solution(int[] s1, int[] s2) {
        int answer = 0;

        Map<Integer, Integer> resultMap = new HashMap<>();

        for(int data : s1) {
            resultMap.put(data, resultMap.getOrDefault(data, 0) + 1);
        }

        for(int complete : s2) {
            resultMap.put(complete, resultMap.get(complete) - 1);
        }

        for (int key : resultMap.keySet()) {
            if (resultMap.get(key) > 0) {
                answer = key;
            }
        }

        return answer;
    }

}
