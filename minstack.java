package stacks;

import java.util.Scanner;
import java.util.Stack;

public class minstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter number of elements: ");
        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            stack.push(num);

            // Maintain the minimum stack
            if (minStack.isEmpty() || num <= minStack.peek()) {
                minStack.push(num);
            }
        }

        // Print minimum element in the stack
        System.out.println("Minimum element in the stack: " + minStack.peek());

        // Pop the top element
        int popped = stack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }

        // Print popped element
        System.out.println("Popped element: " + popped);

        // Print minimum element after popping
        if (!minStack.isEmpty()) {
            System.out.println("Minimum element in the stack after popping: " + minStack.peek());
        } else {
            System.out.println("Stack is empty now.");
        }

        sc.close();
    }
}
