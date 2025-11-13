package Hashing;

import java.util.*;

public class Linearprobingfrequency {

    static class Entry {
        int id;      // transaction ID
        int freq;    // frequency

        Entry(int id, int freq) {
            this.id = id;
            this.freq = freq;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tableSize = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Initialize hash table
        Entry[] hashTable = new Entry[tableSize];
        for (int i = 0; i < tableSize; i++)
            hashTable[i] = new Entry(-1, 0);

        // Insert each transaction ID
        for (int key : arr) {
            insert(hashTable, key, tableSize);
        }

        // Display output
        System.out.println("Hash Table:");
        for (int i = 0; i < tableSize; i++) {
            System.out.println(i + ": " + hashTable[i].id + " " + hashTable[i].freq);
        }

        sc.close();
    }

    // Insert using linear probing
    static void insert(Entry[] table, int key, int tableSize) {
        int index = key % tableSize;

        for (int i = 0; i < tableSize; i++) {

            int probeIndex = (index + i) % tableSize;

            // Case 1: Slot empty → insert here
            if (table[probeIndex].id == -1) {
                table[probeIndex].id = key;
                table[probeIndex].freq = 1;
                return;
            }

            // Case 2: Same key already exists → increment freq
            if (table[probeIndex].id == key) {
                table[probeIndex].freq++;
                return;
            }

            // Else → collision; keep probing next index
        }

        // If table full, insertion ignored (rare for given constraints)
    }
}
