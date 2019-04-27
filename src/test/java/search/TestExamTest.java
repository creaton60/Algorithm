package search;

import org.junit.Test;

public class TestExamTest {

    @Test
    public void test1_testExam() {

        int[] test = {1,2,3,4,5};

        TestExam exam = new TestExam();

        for(int i : exam.solution(test)) {
            System.out.println(i);
        }
    }


    @Test
    public void test2_testExam() {
        int[] test = {1, 3, 2, 4, 2};

        TestExam exam = new TestExam();

        for(int i : exam.solution(test)) {
            System.out.println(i);
        }
    }
}
