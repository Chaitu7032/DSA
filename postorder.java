// A university is developing a digital dictionary tool that organizes characters in a structured way for quick retrieval. The dictionary stores characters inside a Binary Search Tree (BST), where each new character is inserted based on the BST property:



// Characters smaller than the current node are inserted in the left subtree.
// Characters greater than or equal to the current node are inserted in the right subtree.


// To test the dictionary, the university wants to generate the pre-order traversal of the BST after inserting all characters.



// Your task is to help the university build the BST and print the pre-order traversal of the characters.


package BST;

import java.util.Scanner;

class Node {
    char data;
    Node left, right;

    public Node(char data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class postorder {
    
    // Method to insert data in the binary search tree
    public static Node insert(Node root, char data) {
        if (root == null) {
            root = new Node(data);
        } else if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    
    // Method to perform preorder traversal of the tree
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();  // Read the number of nodes to insert
        Node root = null;
        
        while (size != 0) {
            char input = sc.next().charAt(0);  // Read the character input
            root = insert(root, input);  // Insert the character into the tree
            size--;
        }
        
        System.out.print("Preorder traversal: ");
        preorder(root);  // Print preorder traversal
        System.out.println();
        
        sc.close();
    }
}
