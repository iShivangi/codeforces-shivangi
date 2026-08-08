import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int n = sc.nextInt();
        long[] a = new long[n];
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            totalSum += a[i];
        }
        if (totalSum % 3 != 0) {
            System.out.println(0);
            return;
        }
        long target = totalSum / 3;
        long sum = 0;
        long waysToMakeFirstCut = 0;
        long totalWays = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += a[i];
            if (sum == 2 * target) {
                totalWays += waysToMakeFirstCut;
            }
            if (sum == target) {
                waysToMakeFirstCut++;
            }
        }
        System.out.println(totalWays);
    }
}
