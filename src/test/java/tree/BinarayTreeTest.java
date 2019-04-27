package tree;

import org.junit.Test;

public class BinarayTreeTest {

    @Test
    public void test1_BinaryTree() {
        String test ="(A,B) (A,C) (B,D) (D,C)";

        System.out.println(IsBinaryTree.SExpression(test));
    }

    @Test
    public void test2_BinaryTree() {
        String test ="(B,D) (D,E) (A,B) (C,F) (E,G) (A,C)";

        System.out.println(IsBinaryTree.SExpression(test));
    }
}
