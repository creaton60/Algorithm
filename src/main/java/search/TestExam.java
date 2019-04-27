package search;

import java.util.*;

public class TestExam {

    public int[] solution(int[] answers) {
        int[][] inputs = {{1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        int[] count = new int[3];

        for(int i =0; i < answers.length ; i++) {
            if(inputs[0][i%5] == answers[i]) {
                count[0]++;
            }

            if(inputs[1][i%8] == answers[i]) {
                count[1]++;
            }

            if(inputs[2][i%10] == answers[i]) {
                count[2]++;
            }
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];

        int cnt =0;

        for(int num : list) {
            answer[cnt++] = num;
        }

        return answer;
    }
}
