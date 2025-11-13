package binarytrees;

// A chocolate factory is using a binary tree to represent its inventory of chocolates. Each node in the tree represents a batch of chocolates, and the key of each node indicates the number of chocolates in that batch. The factory needs to manage and analyze the chocolate batches efficiently.



// The tasks to be performed are:



// Postorder Traversal: Display the batch sizes in a postorder traversal to review the inventory from the smallest batches to the largest.
// Calculate Total Sum: Compute the total number of chocolates across all batches to understand the total inventory.
// Input format :
// The input consists of three positive integers c1,c2, and c3, where each integer represents the number of chocolates in a batch.

import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

class BinaryTree {

    
    public static void postorderTraversal(Node root) {
        if (root == null)
            return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.key + " ");
    }

    
    public static int calculateSum(Node root) {
        if (root == null)
            return 0;

        return root.key + calculateSum(root.left) + calculateSum(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        
        Node root = new Node(val1);
        root.left = new Node(val2);
        root.right = new Node(val3);

        
        System.out.print("Postorder Traversal: ");
        postorderTraversal(root);
        System.out.println();

        
        int totalSum = calculateSum(root);
        System.out.println("Total sum of all chocolates: " + totalSum);

        sc.close();
    }
}