package search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ? : 와일드카드 - 어떤 한 단어를 모두 대체 한다
 *
 * * : 패턴 매칭 - * 단어의 앞 뒤에 패턴 같은지 여부
 */
public class WordFormat {

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int i= Integer.parseInt(input);

        String[] array = new String[i];

        for(int j=0; j < array.length; j++) {
            array[j] = br.readLine();
        }

        br.close();

        validPattern(array);
    }

    public static void validPattern(String[] array) {
        boolean[] answers = new boolean[array.length];

        for(int i=0; i < array.length; i++) {
            String[] sp = array[i].split(" ");

            Pattern pattern = Pattern.compile(sp[1]);

            Matcher match = pattern.matcher(sp[0]);

            answers[i] = match.matches();
        }

        printArray(answers);
    }

    public static void printArray(boolean[] array) {
        for(boolean bool : array) {
            System.out.println(bool);
        }
    }
}
