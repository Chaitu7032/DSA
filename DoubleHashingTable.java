package Hashing;

import java.util.Scanner;

public class DoubleHashingTable {
    static final int TABLE_SIZE = 15;

    // Secondary hash: as required
    static int secondHash(int key) {
        return 7 - (key % 7);  // yields values in 1..7
    }

    // Insert key into hashTable using double hashing
    static void insert(int hashTable[], int key) {
        int h1 = key % TABLE_SIZE;     // primary hash
        int h2 = secondHash(key);      // secondary hash (step)

        // try up to TABLE_SIZE times (full-cycle protection)
        for (int i = 0; i < TABLE_SIZE; i++) {
            int idx = (h1 + i * h2) % TABLE_SIZE;
            // if slot empty (-1), place the key
            if (hashTable[idx] == -1) {
                hashTable[idx] = key;
                return;
            }
            // optional: if the key is already present, do nothing
            if (hashTable[idx] == key) return;
            // otherwise collision — continue probing with next i
        }
        
    }

    // Display the hash table in required format
    static void display(int hashTable[]) {
        System.out.println("Hash Table:");
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("[" + i + "]: " + hashTable[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                 // number of keys
        int[] keys = new int[n];
        for (int i = 0; i < n; i++) {
            keys[i] = sc.nextInt();
        }

        // initialize table to -1 (empty)
        int[] hashTable = new int[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) hashTable[i] = -1;

        // insert keys
        for (int key : keys) insert(hashTable, key);

        // display result
        display(hashTable);
        sc.close();
    }
}
