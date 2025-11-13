// Problem Statement



// In a classroom with assigned seat numbers ranging from 1 to N, students enter the room and occupy their seats. The seating arrangement is initially in sequential order, but due to a mix-up, one student's seat is left unoccupied. 



// Create a program that utilizes binary search to identify and print the seat number that is missing, helping the teacher quickly resolve the seating discrepancy.

// Input format :
// The first line of input consists of an integer N, representing the total number of seats in the classroom.

// The second line consists of N distinct space-separated integers, representing the occupied seat numbers.

// Output format :
// The output prints a single integer, representing the missing seat number.

// If no seat is found missing, print "No missing seat number found in the classroom."

package searching;

import java.util.Scanner;

public class MissingSeat {

    public static int findMissingSeat(int[] seats, int n) {
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // If the seat at mid is not equal to mid+1, missing seat is on the left
            if (seats[mid] != mid + 1) {
                if (mid == 0 || seats[mid - 1] == mid)
                    return mid + 1;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // No missing seat found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] seats = new int[N];

        for (int i = 0; i < N; i++) {
            seats[i] = sc.nextInt();
        }

        int missingSeat = findMissingSeat(seats, N);
        if (missingSeat == -1)
            System.out.println("No missing seat number found in the classroom.");
        else
            System.out.println(missingSeat);

        sc.close();
    }
}
