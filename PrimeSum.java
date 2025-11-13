package arrays;


import java.util.*;

class PrimeSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        scanner.close();
        
        for (int i = 0; i < n; i++) {
            int currentSum = sum - arr[i];
            if (isPrime(currentSum)) {
                System.out.println(currentSum);
                return;
            }
        }
        
        System.out.println("No valid prime sum found");
        
    }
    
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
}

