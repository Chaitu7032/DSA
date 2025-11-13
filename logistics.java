// Alex, a logistics manager, is responsible for handling various pieces of luggage. He needs to determine the weight distribution among these pieces and find the heaviest and lightest pieces, along with the weight difference between them. 



// To accomplish this, he plans to create a simple program that takes as input the weights of various pieces of luggage and uses the linear search algorithm to search and identify the heaviest and lightest pieces, as well as calculate the weight difference between them.



// Write a program to help Alex accomplish this task.

// Input format :
// The first line consists of an integer N, representing the number of luggage.

// The second line consists of N space-separated integers, representing the weights of the luggage.

// Output format :
// The first line of output prints "Heaviest piece weight: " followed by the weight of the heaviest piece.

// The second line prints "Lightest piece weight: " followed by the weight of the lightest piece.

// The third line prints "Weight difference: " followed by their weight difference.


package searching;

import java.util.Scanner;

public class logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numPieces = scanner.nextInt();
        int[] weights = new int[numPieces];
        
        for (int i = 0; i < numPieces; i++) {
            weights[i] = scanner.nextInt();
        }
        
        int heaviest = weights[0];
        int lightest = weights[0];
        
        for (int i = 1; i < numPieces; i++) {
            if (weights[i] > heaviest) {
                heaviest = weights[i];
            }
            if (weights[i] < lightest) {
                lightest = weights[i];
            }
        }
        
        int weightDifference = heaviest - lightest;
        
        System.out.println("Heaviest piece weight: " + heaviest);
        System.out.println("Lightest piece weight: " + lightest);
        System.out.println("Weight difference: " + weightDifference);
        
        scanner.close();
    }
}
