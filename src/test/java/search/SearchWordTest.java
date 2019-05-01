package search;

import hash.SearchWord;
import org.junit.Test;

public class SearchWordTest {

    @Test
    public void test1_Test() {
        String input ="abc,abcd,abcde,abc,abc";

        String word = "ab";

        System.out.println(SearchWord.solution(input, word));
    }
}
