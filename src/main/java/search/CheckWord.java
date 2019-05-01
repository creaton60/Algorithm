package search;

/**
 * 단어 점검 문제
 *
 * 풀이가 잘못됨 나중에 다시 풀어볼 예정
 *
 */
public class CheckWord {

    private static int validIndex = 0;

    private static int nowIndex(char[] datas, char data) {
        int v=0;

        for(int i=0; i < datas.length; i++) {
            if(datas[i] == data) {
                v = i;
                break;
            }
        }

        return v;
    }

    private static boolean valid(char[] datas, int k, char data) {
        boolean valid = false;

        int v = nowIndex(datas, data);

        if(validIndex < v) {
            return false;
        }

        if(k > datas.length) {
            k = datas.length;
        }

        for(int i=0; i < k; i++) {
            if(datas[i] == data) {
                valid = true;

                break;
            }
        }
        return valid;
    }

    public boolean solution(String s1, String s2) {
        boolean answer = true;

        char[] datas = s1.toCharArray();

        char[] inputs = s2.toCharArray();

        for(int i=0; i < inputs.length; i++) {
            int j;

            if(i >= datas.length) {
                j = datas.length-1;
            } else {
                j = i;
            }

            if(inputs[i] != datas[j]) {
                answer = valid(datas, i, inputs[i]);

                if(!answer) {
                    break;
                } else {
                    validIndex = nowIndex(datas, inputs[i]);
                }

            }
        }
        return answer;
    }
}
