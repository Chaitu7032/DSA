// You are assigned the task of developing a package delivery system for a logistics company. The system should enable efficient management of packages for delivery, including prioritizing deliveries based on certain criteria.



// The program utilizes a priority queue to manage packages for delivery. Each package is represented by its destination and a delivery priority. The delivery priority is a value between 1 and 5, with higher values indicating higher priority for delivery.



// The system offers the following options Add package, Deliver package, View next package for delivery, and Exit.

package priorityinsertionheap;

import java.util.*;


class Package {
    String destination;
    int priority;

    public Package(String destination, int priority) {
        this.destination = destination;
        this.priority = priority;
    }
}

public class packagedelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        PriorityQueue<Package> pq = new PriorityQueue<>((a, b) -> b.priority - a.priority);

        while (sc.hasNext()) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1: { 
                    sc.nextLine(); 
                    String destination = sc.nextLine();
                    int priority = sc.nextInt();
                    pq.add(new Package(destination, priority));
                    System.out.println("Package added to the delivery queue.");
                    break;
                }
                case 2: { 
                    if (pq.isEmpty()) {
                        System.out.println("No packages in the delivery queue.");
                    } else {
                        Package delivered = pq.poll();
                        System.out.println("Delivered package to: " + delivered.destination);
                    }
                    break;
                }
                case 3: { 
                    if (pq.isEmpty()) {
                        System.out.println("No packages in the delivery queue.");
                    } else {
                        System.out.println("Next package for delivery: " + pq.peek().destination);
                    }
                    break;
                }
                case 4: { 
                    System.out.println("Exiting the application.");
                    sc.close();
                    return;
                }
                default: { 
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
                }
            }
        }
        sc.close();
    }
}

