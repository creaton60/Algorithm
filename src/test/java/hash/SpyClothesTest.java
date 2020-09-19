package hash;

import org.junit.Assert;
import org.junit.Test;

public class SpyClothesTest {

    @Test
    public void test1_SpyClothes() {
        String[][] test = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        SpyClothes clothes = new SpyClothes();

        Assert.assertEquals(5, clothes.solution(test));

    }

    @Test
    public void test2_SpyClothes() {
        String[][] test = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        SpyClothes clothes = new SpyClothes();

        Assert.assertEquals(3, clothes.solution(test));

    }
}
