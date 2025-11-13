package queues;

import java.util.Scanner;

 class magicalqueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int M = scanner.nextInt();
        int[] queue = new int[M];

        
        for (int i = 0; i < M; i++) {
            queue[i] = scanner.nextInt();
        }

        
        int N = scanner.nextInt();
        int magicalSum = calculateMagicalSum(queue, N);
        System.out.println(magicalSum);

        scanner.close();
    }

    
    public static int calculateMagicalSum(int[] queue, int N) {
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += queue[i];  
        }
        return sum;
    }
}
