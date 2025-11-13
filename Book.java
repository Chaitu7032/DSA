package stacks;

import java.util.*;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        while (true) {
            int choice = sc.nextInt();
            
            if (choice == 1) {  // Push
                int bookID = sc.nextInt();
                stack.push(bookID);
                System.out.println("Book ID " + bookID + " is pushed onto the stack");
            } 
            else if (choice == 2) {  // Pop
                if (stack.isEmpty()) {
                    System.out.println("Stack Underflow");
                } else {
                    int removed = stack.pop();
                    System.out.println("Book ID " + removed + " is popped from the stack");
                }
            } 
            else if (choice == 3) {  // Display
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                } else {
                    for (int i = stack.size() - 1; i >= 0; i--) {
                        System.out.print(stack.get(i) + " ");
                    }
                    System.out.println();
                }
            } 
            else if (choice == 4) {  // Exit
                System.out.println("Exiting the program");
                break;
            } 
            else {  // Invalid input
                System.out.println("Invalid choice");
            }
        }
        
        sc.close();
    }
}
