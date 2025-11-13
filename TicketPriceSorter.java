import java.util.Scanner;

public class TicketPriceSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                 // number of tickets
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();
        int k = sc.nextInt();                 // kth smallest

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (prices[j] < prices[min]) min = j;

            int temp = prices[i];
            prices[i] = prices[min];
            prices[min] = temp;
        }

        // Print sorted prices
        for (int p : prices) System.out.print(p + " ");
        System.out.println();

        // Print kth smallest price
        if (k >= 1 && k <= n)
            System.out.println(prices[k - 1]);
        else
            System.out.println("Invalid k");

        sc.close();
    }
}
