package stack;

import java.util.Stack;

public class PrefixToPosfix {

    private static boolean isOperator(char x) {
        return x == '+' || x == '-' || x == '*' || x == '/';
    }

    public static String preToPost(String pre_exp) {
        Stack<String> s= new Stack<>();

        int length = pre_exp.length();

        char[] prefixArray = pre_exp.toCharArray();

        for (int i = length - 1; i >= 0; i--)
        {

            if(isOperator(prefixArray[i])) {
                String op1 = s.peek(); s.pop();
                String op2 = s.peek(); s.pop();

                String temp = op1 + op2 + prefixArray[i];

                s.push(temp);
            }

            else
            {
                s.push( prefixArray[i]+"");
            }
        }

        return s.peek();

    }
}
