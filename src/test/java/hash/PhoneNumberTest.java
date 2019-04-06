package hash;

import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberTest {

    @Test
    public void test1_phoneNumberTest() {
        String[] test = {"119", "97674223", "1195524421"};

        PhoneNumber number = new PhoneNumber();

        Assert.assertFalse(number.solution(test));
    }

    @Test
    public void test2_phoneNumberTest() {
        String[] test = {"123", "456", "789"};

        PhoneNumber number = new PhoneNumber();

        Assert.assertTrue(number.solution(test));
    }

    @Test
    public void test3_phoneNumberTest() {
        String[] test = {"12", "123", "1235", "567", "88"};

        PhoneNumber number = new PhoneNumber();

        Assert.assertFalse(number.solution(test));

    }
}
