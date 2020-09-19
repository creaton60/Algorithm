package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수를 찾는 문제 풀이
 *
 * 해시함수로 풀 수 있다.
 *
 * 동명이인이 있지만 Key 가 같으면 같은 값에 들어간다.
 *
 * 즉 동명이인이 n 이 되면 실제 value 도 n 이 된다.
 *
 * 완주했다면 -를 하기 때문에 n 명이 모두 완주 했다면 -n 0이 된다.
 *
 * 즉 동명이인 중 완주하지 못한 사람이 있다면 그 숫자만큼 출력하면 되나.
 *
 * 여기는 완주 못한 사람은 1명이니 1명만 출력하면 된다.
 *
 *
 */
public class NotFinishPlayer {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> resultMap = new HashMap<>(); //모든 참가자는 여기에 넣는다.

        for (String part : participant) {
            resultMap.put(part, resultMap.getOrDefault(part, 0) + 1); //참가자와 기본 값을 증가시킨다.
        }

        for(Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("참가자 : " + entry.getKey() + ", " + entry.getValue());
        }

        for (String complete : completion) {
            resultMap.put(complete, resultMap.get(complete) - 1);
        }

        for(Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("완주자 : " + entry.getKey() + ", " + entry.getValue());
        }

        for (String key : resultMap.keySet()) {
            if (resultMap.get(key) > 0) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};

        String[] completion = {"stanko", "mislav", "ana"};

        System.out.println("완주 못한 자 : "  + NotFinishPlayer.solution(participant, completion));
    }
}
