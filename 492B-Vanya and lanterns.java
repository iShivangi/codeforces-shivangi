import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        double maxGap = 0;
        for (int i = 0; i < n - 1; i++) {
            double gap = (a[i + 1] - a[i]) / 2.0;
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        double startGap = a[0] - 0;
        double endGap = l - a[n - 1];
        double result = Math.max(maxGap, Math.max(startGap, endGap));
        System.out.printf("%.10f\n", result);
    }
}
