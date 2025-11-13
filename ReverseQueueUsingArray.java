package queues;

import java.util.*;

 class ReverseQueueUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();
        int[] queue = new int[N];
        int rear = 0;

        
        for (int i = 0; i < N; i++) {
            queue[rear++] = scanner.nextInt();
        }

        
        for (int i = rear - 1; i >= 0; i--) {
            System.out.print(queue[i] + " ");
        }
        scanner.close();
    }
}

