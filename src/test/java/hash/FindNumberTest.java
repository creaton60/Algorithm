package hash;

import org.junit.Assert;
import org.junit.Test;

public class FindNumberTest {

    @Test
    public void test_Find_Number() {
        FindNumber number = new FindNumber();

        int[] s1 = {4, 99, 2, 6, 7, 13, 88, 76};

        int[] s2 = {6, 88, 13, 4, 99, 2, 7};

        Assert.assertEquals(number.solution(s1, s2), 76);
    }
}
