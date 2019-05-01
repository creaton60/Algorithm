package hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 입력된 여러 단어가 들어 왔을 때
 *
 * 그 다음 들어온 단어를 검색
 *
 * 검색된 단어를 많이 접근한 순으로 풀어주는 문제
 *
 */
public class SearchWord {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String word = br.readLine();

        System.out.println(SearchWord.solution(input, word));
    }

    public static String solution(String inputs, String word) {
        StringTokenizer st = new StringTokenizer(inputs, ",");

        Map<String, Integer> wordMap = new HashMap<>();

        List<String> keySetList = new ArrayList<>();

        while(st.hasMoreTokens()) {
            String data = st.nextToken();

            wordMap.put(data, wordMap.getOrDefault(data, 0) + 1); //기본 값 증가.
        }

        for (String key : wordMap.keySet()) {
            if (key.startsWith(word)) {
                keySetList.add(key);
            }
        }

        keySetList.sort((o1, o2) -> wordMap.get(o2).compareTo(wordMap.get(o1)));

        StringBuilder builder = new StringBuilder();

        for(int i=0, size = keySetList.size(); i < size ; i++) {
            builder.append(keySetList.get(i));
            if(i < size -1) {
                builder.append(",");
            }
        }

        return builder.toString();
    }
}
