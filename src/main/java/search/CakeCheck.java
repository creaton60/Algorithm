package search;

/**
 * 값이 0이되는 데이터 찾는 문제
 *
 * 정확한 풀이는 아님 테스트 케이스 완벽 통과 못함.
 *
 */
public class CakeCheck {

    public int solution(int number, int[] firecracker) {
        int answer = 0;

        int sum;

        sum = firecracker[firecracker.length -1];

        if(sum == 0) {
            answer += 2;
        }

        for(int i = firecracker.length -2 ; i > 0; i--) {

            int k = firecracker[i];

            if(sum > 0) {
                sum = sum -k;
            } else {
                sum = sum + k;
            }

            if(sum == 0 && k ==0) {
                answer++;
            }
        }

        if(answer == 0 && sum > 0) {
            answer = 1;
        } else if(answer == 0 && sum ==0) {
            answer = number;
        }

        return answer;
    }
}
