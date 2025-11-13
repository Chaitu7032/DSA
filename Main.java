package searching;

// Ashok wants to develop a program for a classroom seating arrangement system where students are represented by unique integers. 



// Implement a function to perform a linear search and swap the positions of two students based on their IDs. 



// In the main program, input the number of students, their IDs, and the IDs of two students to swap. Display the updated seating arrangement after swapping the positions of the specified students.

// Input format :
// The first line of input consists of an integer N, representing the number of students.

// The second line consists of N space-separated integers, representing the student IDs.

// The third line consists of an integer, representing the ID of the first student to swap.

// The fourth line consists of an integer, representing the ID of the second student to swap.

// Output format :
// The output prints the updated seating arrangement after swapping the positions of the specified students.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        
        int index1 = -1, index2 = -1;
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == value1) {
                index1 = i;
            } else if (arr[i] == value2) {
                index2 = i;
            }
        }
        
        if (index1 != -1 && index2 != -1) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scanner.close();
    }
}
