package sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * 프로그래머스 문제 가장 큰수
 *
 * Java 람다로 라인을 줄였다.
 *
 * IDEA 에서 sort 까지 다 합치는 소스를 권유 변경헀다.
 *
 * 주석이 바꾸기 전 소스
 *
 */
public class BigNumber {

    public String solution(int[] numbers) {
        String answer;

        List<String> list = Arrays.stream(numbers).
                boxed().
                map(String::valueOf).
                sorted((num1, num2) -> (num2 + num1).compareTo(num1 + num2)).collect(Collectors.toList());

//        List<String> list = Arrays.stream(numbers).boxed().map(String::valueOf).collect(Collectors.toList());
//
//        list.sort((num1, num2) -> (num2 + num1).compareTo(num1 + num2));

        if(list.get(0).equals("0")) {
            answer ="0";
        } else{
            answer = String.join("", list);
        }

        return answer;
    }
}
