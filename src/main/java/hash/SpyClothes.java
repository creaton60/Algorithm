package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 스파이가 입을 수 있는 의류 세기
 *
 * 생각한 방법
 *
 * 2차원 배열의 총 사이즈 + 각 의상 별 분류 후 HashMap Value Size 의 곱
 *
 * 선택 안하는 경우가 포함되므로 +1
 *
 * 아무것도 선택 안하는 경우가 있으므로 전체에서는 -1
 */
public class SpyClothes {

    public int solution(String[][] clothes) {
        int answer = 0;


        Map<String, Integer> returnMap = new HashMap<>();

        for (String[] clothe : clothes) {
            returnMap.put(clothe[1], returnMap.getOrDefault(clothe[1], 0) + 1);
        }

        long mix =1L;

        for (String key : returnMap.keySet()) {
            mix = mix * (returnMap.get(key) +1);
        }

        answer += mix;

        answer -=1;

        return answer;
    }
}
