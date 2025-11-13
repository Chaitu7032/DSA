import java.util.Scanner;

public class SelectionSortHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of students
        int n = sc.nextInt();
        int[] heights = new int[n];

        // Read heights
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // Print original order
        System.out.println("Student's height order before sorting:");
        printArray(heights);

        // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (heights[j] < heights[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = heights[i];
            heights[i] = heights[minIndex];
            heights[minIndex] = temp;

            // Print array after each iteration
            System.out.println("Height order of students after iteration " + (i + 1));
            printArray(heights);
        }

        // Print final sorted order
        System.out.println("After the final comparison of all students, the height order becomes:");
        printArray(heights);
    }

    // Helper method to print array elements space-separated
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(" ");
        }
        System.out.println();
    }
}
