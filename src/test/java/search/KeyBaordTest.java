package search;

import org.junit.Test;

public class KeyBaordTest {

    @Test
    public void test1_keyBoard() {
        String s = "5111";

        String keypad = "752961348";


        System.out.println(KeyBoard.entryTime(s, keypad));

    }

    @Test
    public void test2_keyBoard() {
        String s = "5555935";

        String keypad = "923857614";


        System.out.println(KeyBoard.entryTime(s, keypad));
    }


    @Test
    public void test3_keyBoard() {
        String s = "91566165";

        String keypad = "639485712";


        System.out.println(KeyBoard.entryTime(s, keypad));
    }
}
