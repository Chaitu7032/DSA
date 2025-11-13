package Hashing;
import java.util.Scanner;

public class quadraticprobing {
    static final int TABLE_SIZE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize hash table with -1
        int[] hashTable = new int[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            hashTable[i] = -1;
        }

        int n = sc.nextInt();
        int[] trucks = new int[n];

        for (int i = 0; i < n; i++) {
            trucks[i] = sc.nextInt();
        }

        int maxLoad = -1;   // highest capacity
        int maxIndex = -1;  // where it is stored

        // Insert trucks using quadratic probing
        for (int i = 0; i < n; i++) {
            int key = trucks[i];
            int hashIndex = key % TABLE_SIZE;  // main hash
            int index = hashIndex;
            int j = 1;

            // collision → quadratic probing
            while (hashTable[index] != -1) {
                index = (hashIndex + j * j) % TABLE_SIZE;
                j++;
            }

            // insert into hash table
            hashTable[index] = key;

            // update max capacity tracker
            if (key > maxLoad) {
                maxLoad = key;
                maxIndex = index;
            }
        }

        System.out.println("The lorry that has high load capacity is in index " + maxIndex + ".");
        sc.close();
    }
}
