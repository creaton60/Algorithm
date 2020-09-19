package search;

import org.junit.Assert;
import org.junit.Test;

public class CheckWordTest {

    @Test
    public void testCheckWord() {
        CheckWord checkWord = new CheckWord();

        String data ="cookie";

        String data2 = "cooookieee";

        Assert.assertTrue(checkWord.solution(data, data2));
    }

    @Test
    public void testCheckWord2() {
        CheckWord checkWord = new CheckWord();

        String data ="cookie";

        String data2 = "cokie";

        Assert.assertFalse(checkWord.solution(data, data2));
    }

    @Test
    public void testCheckWord3() {
        CheckWord checkWord = new CheckWord();

        String data ="cookie";

        String data2 = "cookoie";

        Assert.assertFalse(checkWord.solution(data, data2));
    }
}
