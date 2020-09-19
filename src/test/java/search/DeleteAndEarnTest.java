package search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DeleteAndEarnTest {

    @Test
    public void test1_deletAndEarn() {

        List<Integer> test = new ArrayList<>();

        test.add(3);
        test.add(3);
        test.add(4);
        test.add(2);

        DeleteAndEarn delete = new DeleteAndEarn();

        System.out.println(DeleteAndEarn.deleteAndEarn(test));
    }

    @Test
    public void test2_deleteAndEarn() {
        List<Integer> test = new ArrayList<>();

        test.add(1);
        test.add(2);
        test.add(1);
        test.add(3);
        test.add(2);
        test.add(3);
        DeleteAndEarn delete = new DeleteAndEarn();

        System.out.println(DeleteAndEarn.deleteAndEarn(test));

    }

    @Test
    public void test3_deleteAndEarn() {
        List<Integer> test = new ArrayList<>();

        test.add(5);
        test.add(6);
        test.add(6);
        test.add(4);
        test.add(11);

        System.out.println(DeleteAndEarn.deleteAndEarn(test));

    }
}
