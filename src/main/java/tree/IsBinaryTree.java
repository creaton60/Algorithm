package tree;

import java.util.LinkedList;
import java.util.Queue;

public class IsBinaryTree {
    private static Node root;

    private static class Node {
        char key;

        Node leftChild;
        Node rightChild;

        Node(char key) {
            this.key = key;
        }
    }

    public static String SExpression(String nodes) {
        String[] nodeList = nodes.split(" ");


        for(String data : nodeList) {
            char[] array = data.toCharArray();

            addNode(array[1], array[3]);
            addNode(array[1], array[3]);
        }

        BFS();

        inOrderTraverse(root);

        System.out.println();

        preOrderTraverse(root);

        System.out.println();

        postOrderTraverse(root);


        return null;
    }

    public static Node findNode(char key) {
        if (root == null) return null;

        Node focusNode = root;

        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null)
                return null;
        }

        return focusNode;
    }

    public static void addNode(char key, char child) {
        if (findNode(key) != null) {
            return;
        }

        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while(true) {
                parent = focusNode;

                if(parent.leftChild == null) {
                    parent.leftChild = newNode;

                    return;
                } else {

                }

                if (key < parent.key) {
                    focusNode = parent.leftChild;

                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = parent.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public static void BFS() {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node n = q.poll();

            if (n.leftChild !=null) {
                q.offer(n.leftChild);
            }


            if (n.rightChild !=null) {
                q.offer(n.rightChild);
            }
        }
    }

    public static void inOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            System.out.print("(");
            inOrderTraverse(focusNode.leftChild);
            System.out.print((char)focusNode.key + " ");
            inOrderTraverse(focusNode.rightChild);
            System.out.print(")");
        }
    }

    public static void postOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            System.out.print("(");
            System.out.print((char)focusNode.key + " ");
            inOrderTraverse(focusNode.leftChild);
            inOrderTraverse(focusNode.rightChild);
            System.out.print(")");
        }
    }

    public static void preOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            System.out.print("(");
            inOrderTraverse(focusNode.leftChild);
            inOrderTraverse(focusNode.rightChild);
            System.out.print((char)focusNode.key + " ");
            System.out.print(")");
        }
    }
}
