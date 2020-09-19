package sort;

import org.junit.Assert;
import org.junit.Test;

public class BigNumberTest {

    @Test
    public void test_bigNumber() {

        int[] array = {6,10,2};

        BigNumber number = new BigNumber();

        Assert.assertEquals("6210", number.solution(array));

    }
}
