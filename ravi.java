// Ravi is given an array of integers and is tasked with sorting it uniquely. He needs to sort the elements in such a way that the elements at odd positions are in descending order, and the elements at even positions are in ascending order.



// Your task is to help Ravi create a program that uses insertion sort to sort the array as per the specified conditions and then print the sorted array. Position starts from 1.



// Example

// Input:

// Size of the array = 10

// Array elements = 25 36 96 58 74 14 35 15 75 95


package priorityinsertionheap;

import java.util.Scanner;

public class ravi {
    public static void evenOddInsertionSort(int[] arr, int n) {
        for (int i = 2; i < n; i++) {
            int j = i - 2;
            int temp = arr[i];

            if ((i + 1) % 2 == 1) {
                while (j >= 0 && temp >= arr[j]) {
                    arr[j + 2] = arr[j];
                    j -= 2;
                }
                arr[j + 2] = temp;
            } else {
                while (j >= 0 && temp <= arr[j]) {
                    arr[j + 2] = arr[j];
                    j -= 2;
                }
                arr[j + 2] = temp;
            }
        }
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        evenOddInsertionSort(arr, n);
        printArray(arr, n);
    }
}