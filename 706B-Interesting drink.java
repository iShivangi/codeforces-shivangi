import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int countShops(int[] prices, int coin) {
        int low = 0;
        int high = prices.length - 1;
        int count = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prices[mid] <= coin) {
                count = mid + 1; 
                low = mid + 1;   
            } else {
                high = mid - 1;  
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        int q = sc.nextInt(); 
        for (int i = 0; i < q; i++) {
            int m = sc.nextInt(); 
            System.out.println(countShops(prices, m));
        }
    }
}
