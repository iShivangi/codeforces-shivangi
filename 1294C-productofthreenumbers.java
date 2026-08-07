import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();     
            int a = -1;
            int b = -1;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    a = i;
                    break; 
                }
            }
            if (a != -1) {
                int temp = n / a;
                for (int i = a + 1; i * i <= temp; i++) {
                    if (temp % i == 0) {
                        b = i;
                        break;
                    }
                }
            }
            if (a != -1 && b != -1) {
                int c = n / (a * b);
                if (c > b) {
                    System.out.println("YES");
                    System.out.println(a + " " + b + " " + c);
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
