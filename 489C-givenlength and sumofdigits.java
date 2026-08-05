import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int m = sc.nextInt();
        int s = sc.nextInt();
        if (s == 0 && m == 1) {
            System.out.println("0 0");
            return;
        }
        if (s == 0 || s > 9 * m) {
            System.out.println("-1 -1");
            return;
        }
        StringBuilder max = new StringBuilder();
        int sum = s;
        for (int i = 0; i < m; i++) {
            int digit = Math.min(9, sum);
            max.append(digit);
            sum -= digit;
        }
        StringBuilder min = new StringBuilder();
        sum = s;
        for (int i = 0; i < m; i++) {
            for (int d = 0; d <= 9; d++) {
                if (i == 0 && d == 0 && m > 1) {
                    continue;
                }
                int remDigits = m - 1 - i;
                if (sum - d >= 0 && sum - d <= 9 * remDigits) {
                    min.append(d);
                    sum -= d;
                    break; 
                }
            }
        }

        System.out.println(min.toString() + " " + max.toString());
    }
}
