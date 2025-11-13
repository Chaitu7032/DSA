package queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerServiceQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        // Read the initial number of customers
        int N = scanner.nextInt();

        // Read the customer IDs and add them to the queue
        for (int i = 0; i < N; i++) {
            int customerId = scanner.nextInt();
            queue.add(customerId);
        }

        // Process operations
        while (true) {
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    // Enqueue a new customer
                    int newCustomerId = scanner.nextInt();
                    queue.add(newCustomerId);
                    System.out.println("Enqueued " + newCustomerId);
                    break;

                case 2:
                    // Dequeue a customer
                    if (!queue.isEmpty()) {
                        int servedCustomerId = queue.poll();
                        System.out.println("Dequeued " + servedCustomerId);
                    } else {
                        System.out.println("Queue is empty, no customer to serve.");
                    }
                    break;

                case 3:
                    // Check current size of the queue
                    System.out.println("Current queue size: " + queue.size());
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid operation.");
            }
        }
    }
}
