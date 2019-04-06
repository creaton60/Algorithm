package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 전화번호 목록에서
 *
 * A 의 번호가 다른 사람 번호의 접두어인지 체크합니다.
 *
 * 문제 풀이.
 *
 * 처음에는 Hash 로 접근.
 *
 * 문제 잘 풀었으나 효율성 검사에서 낙제..
 *
 * 해시를 포기하고 String / startwith 로 해결
 *
 * 그대로 낙제
 *
 * for 문 break 로 해결
 *
 * 결론:
 * 해시로 뭔가 너무 오래걸리겠다 싶으면 바로 탐색으로 해결하자.
 *
 */
public class PhoneNumber {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for(String phone : phone_book) {
            for(String compare : phone_book) {
                if(compare.startsWith(phone) && !compare.equals(phone)) {
                    answer = false;

                    break;
                }
            }
        }

        return answer;
    }

}
