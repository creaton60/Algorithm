package stack;

import org.junit.Test;

public class PrefixToPostfixTest {

    @Test
    public void test1_prefixToPostfix() {
        String test ="*34";

        System.out.println(PrefixToPosfix.preToPost(test));

    }

    @Test
    public void test2_prefixToPostFix() {
        String test ="+1**23/14";

        System.out.println(PrefixToPosfix.preToPost(test));


    }
}
