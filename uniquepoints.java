package arrays;

import java.util.*;

public class uniquepoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read input
        int N = sc.nextInt();
        int[] points = new int[N];
        for (int i = 0; i < N; i++) {
            points[i] = sc.nextInt();
        }

        // Step 2: Create a list to store unique reward points
        ArrayList<Integer> uniquePoints = new ArrayList<>();

        // Step 3: Iterate and remove duplicates
        if (N > 0) {
            uniquePoints.add(points[0]); // Add the first element

            for (int i = 1; i < N; i++) {
                if (points[i] != points[i - 1]) {
                    uniquePoints.add(points[i]);
                }
            }
        }

        // Step 4: Print the cleaned list
        for (int i = 0; i < uniquePoints.size(); i++) {
            System.out.print(uniquePoints.get(i) + " ");
           
        }
        System.out.println();

        // Step 5: Print the total count of unique points
        System.out.println(uniquePoints.size());

        sc.close();
    }
}
