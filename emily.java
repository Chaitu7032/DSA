// Emily is studying binary search trees (BST). She wants to write a program that inserts characters into a BST and then finds and prints the minimum and maximum values.



// Guide her with the program.

// Input format :
// The first line of input consists of an integer N, representing the number of values to be inserted into the BST.

// The second line consists of N space-separated characters.

// Output format :
// The first line of output prints "Minimum value: " followed by the minimum value of the given inputs.

// The second line prints "Maximum value: " followed by the maximum value of the given inputs.

package binarytrees;

import java.util.Scanner;

class Node {
    char data;
    Node left, right;

    public Node(char data) {
        this.data = data;
        left = right = null;
    }
}

class emily {

    
    public static Node insert(Node root, char data) {
        if (root == null) {
            return new Node(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    
    public static char findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    
    public static char findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node root = null;

        int size = scanner.nextInt();
        while (size != 0) {
            char c = scanner.next().charAt(0);
            root = insert(root, c);
            size--;
        }

        System.out.println("Minimum value: " + findMin(root));
        System.out.println("Maximum value: " + findMax(root));

        scanner.close();
    }
}