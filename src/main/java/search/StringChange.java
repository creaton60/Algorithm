package search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문자열을 새롭게 변형하는 문제
 *
 *
 */
public class StringChange {


    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int i = Integer.parseInt(input);

        String[] array = new String[i];

        for(int j=0; j < array.length; j++) {
            array[j] = br.readLine();
        }

        convertString(array);
    }

    public static void convertString(String[] array) {
        String[] answers = new String[array.length];

        for(int j=0; j < array.length; j++) {
            char[] chars = array[j].toCharArray();

            char[] answer = new char[chars.length];

            for(int i=0; i < chars.length; i++) {
                answer[i] = convertCharacter(chars[i]);

                if(i == (chars.length - 1) && answer[i] == ' ') {
                    answer[i] = Character.MIN_VALUE;
                }
            }

            answers[j] = String.valueOf(answer);
        }

        printArray(answers);
    }

    public static void printArray(String[] array) {
        for(String data : array) {
            StringTokenizer st = new StringTokenizer(data, " ");

            StringBuilder sb = new StringBuilder();

            while(st.hasMoreTokens()) {
                sb.append(st.nextToken()).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    public static char convertCharacter(char data) {
        if((int) data < 48) {
            return ' ';
        }

        if((int) data > 57 && (int) data < 65) {
            return ' ';
        }

        if((int) data > 90 && (int) data < 97) {
            return ' ';
        }

        if((int) data > 122) {
            return ' ';
        }

        return data;
    }

}

