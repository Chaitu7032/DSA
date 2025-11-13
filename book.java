// Ganga starts with an empty BST. She receives a list of book initials, which she needs to insert into her BST. After inserting all the books, she wants to print the inorder traversal of the BST, which will show her books in alphabetical order.



// Help Ganga by writing a program that constructs the BST with the given book initials and then performs an in-order traversal of the tree.

// Input format :
// The first line contains an integer N, the number of book initials Ganga has.

// The second line contains a single character (an uppercase letter 'A' to 'Z'), representing the initial of each book.

package BST;

import java.util.Scanner;

class Node {
    char data;
    Node left, right;

    public Node(char data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {

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

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Node root = null;
        while (size-- > 0) {
            char input = sc.next().charAt(0);
            root = insert(root, input);
        }

        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();
    }
}
