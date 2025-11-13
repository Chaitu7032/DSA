// Given an array of integers, count the number of smaller elements that appear to the right of each element. Implement a solution using merge sort to count these elements efficiently. Output the result as an array of counts corresponding to each element in the original array.



// Example

// Input:

// 4

// 5 2 6 1



// Output: 

// 2 1 1 0 



// ﻿Explanation:

// To the right of 5, there are 2 smaller elements (2 and 1).

// To the right of 2, there is only 1 smaller element (1).

// To the right of 6, there is 1 smaller element (1).

// To the right of 1, there is 0 smaller element.

// Input format :
// The first line of input contains a single integer n, representing the length of the array.

// The second line contains n space-separated integers, representing the elements of the array.

// Output format :
// The output prints a single line containing the counts of smaller elements for each value in the array, separated by a space.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following specifications:

// 1 ≤ n ≤ 20

// -100 ≤ elements ≤ 100

package mergequickselection;

import java.util.*;

class merge{

    static class Element {
        int value;
        int index;

        Element(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    static void mergeSort(Element[] elements, int left, int right, int[] result) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(elements, left, mid, result);
        mergeSort(elements, mid + 1, right, result);

        merge(elements, left, mid, right, result);
    }

    static void merge(Element[] elements, int left, int mid, int right, int[] result) {
        List<Element> merged = new ArrayList<>();
        int i = left, j = mid + 1;
        int rightCount = 0;

        while (i <= mid && j <= right) {
            if (elements[i].value <= elements[j].value) {
                result[elements[i].index] += rightCount;
                merged.add(elements[i++]);
            } else {
                rightCount++;
                merged.add(elements[j++]);
            }
        }

        while (i <= mid) {
            result[elements[i].index] += rightCount;
            merged.add(elements[i++]);
        }

        while (j <= right) {
            merged.add(elements[j++]);
        }

        for (int k = 0; k < merged.size(); k++) {
            elements[left + k] = merged.get(k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        Element[] elements = new Element[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            elements[i] = new Element(nums[i], i);
        }

        int[] result = new int[n];
        mergeSort(elements, 0, n - 1, result);

        for (int count : result) {
            System.out.print(count + " ");
        }

        sc.close();
    }
}
// i have implemented the rough code . other will be implemented soon by me in future 

