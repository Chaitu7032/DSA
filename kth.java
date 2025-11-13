// You are working with a charity organization that receives a stream of donations from different donors. Your task is to develop a program that finds the Kth largest donation amount received so far. To achieve this, you decide to implement the heap sort approach.



// Write a program that takes the number of donations, the donation amounts, and an integer K as inputs. The program should use the max-heap sort approach to find and output the Kth largest donation amount from the array of donations.




package priorityinsertionheap;

import java.util.*;

public class kth {

    
    static void heapify(int arr[], int n, int i) {
        int largest = i;       
        int left = 2 * i + 1;  
        int right = 2 * i + 2; 

        
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            
            heapify(arr, n, largest);
        }
    }

    
    static void buildMaxHeap(int arr[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Function to extract max element from heap
    static int extractMax(int arr[], int n) {
        if (n <= 0) return Integer.MIN_VALUE;

        int max = arr[0];
        arr[0] = arr[n - 1];
        heapify(arr, n - 1, 0);

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid K value.");
            return;
        }

        
        buildMaxHeap(arr, n);

        int result = -1;

        
        for (int i = 0; i < k; i++) {
            result = extractMax(arr, n - i);
        }

        System.out.println("The " + k + "th largest donation amount is: " + result);

        sc.close();
    }
}
