package binarytrees;
// You are working on a financial application with investment portfolios represented as a binary tree, where each node holds an investment's worth. Implement a preorder traversal algorithm to calculate the total value of all investments in the portfolio. This total will aid in analysis and reporting for your clients.

// Input format :
// The first line contains a single integer n, representing the number of nodes in the binary tree.

// The second line contains n space-separated integers, representing the values of the nodes in the binary tree.

import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class investment {
    static Node createNode(int data) {
        Node newNode = new Node(data);
        return newNode;
    }

    static Node insertNode(Node root, int data) {
        if (root == null) {
            return createNode(data);
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    static int preorderTraversalAndSum(Node root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " ");
            sum += curr.data;

            if (curr.right != null) {
                stack.push(curr.right);
            }

            if (curr.left != null) {
                stack.push(curr.left);
            }
        }

        return sum;
    }

    static void deleteTree(Node root) {
        if (root == null) {
            return;
        }
        deleteTree(root.left);
        deleteTree(root.right);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Node root = null;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insertNode(root, data);
        }

        int sum = preorderTraversalAndSum(root);
        System.out.println("\n" + sum);

        deleteTree(root);
    }
}
