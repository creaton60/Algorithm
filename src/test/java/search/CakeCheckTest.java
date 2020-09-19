package search;

import org.junit.Assert;
import org.junit.Test;

public class CakeCheckTest {

    @Test
    public void testCakeCheck() {
        CakeCheck cakeCheck = new CakeCheck();

        int n =4;

        int[] a = {0,1,0,5};

        Assert.assertEquals(cakeCheck.solution(n, a), 1);
    }

    @Test
    public void testCakeCheck2() {
        CakeCheck cakeCheck = new CakeCheck();

        int n =2;

        int[] a = {0,0};

        Assert.assertEquals(cakeCheck.solution(n, a), 2);
    }

    @Test
    public void testCakeCheck3() {
        CakeCheck cakeCheck = new CakeCheck();

        int n =10;

        int[] a = {1, 1, 3, 0, 0, 0, 2, 1, 0, 3};

        Assert.assertEquals(cakeCheck.solution(n, a), 3);
    }

    @Test
    public void testCakeCheck4() {
        CakeCheck cakeCheck = new CakeCheck();

        int n =4;

        int[] a = {1, 1, 1,1};

        Assert.assertEquals(cakeCheck.solution(n, a), 1);
    }

    @Test
    public void testCakeCheck5() {
        CakeCheck cakeCheck = new CakeCheck();

        int n =4;

        int[] a = {1, 5, 1, 0};

        Assert.assertEquals(cakeCheck.solution(n, a), 2);
    }

    @Test
    public void testCakeCheck6() {
        CakeCheck cakeCheck = new CakeCheck();

        int n =5;

        int[] a = {1, 0, 0, 0, 2};

        Assert.assertEquals(cakeCheck.solution(n, a), 3);
    }
}
