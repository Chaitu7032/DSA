package arrays;


import java.util.Scanner;

class rowSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int maxSumRowIndex = -1;
        for (int i = 0; i < R; i++) {
            int rowSum = 0;
            for (int j = 0; j < C; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxSumRowIndex = i;
            }
        }
        for (int i = 0; i < R; i++) {
            if (i != maxSumRowIndex) {
                for (int j = 0; j < C; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}

