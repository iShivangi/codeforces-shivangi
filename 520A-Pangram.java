import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int n = sc.nextInt();
        String str = sc.next();
        if (n < 26) {
            System.out.println("NO");
            return;
        }
        str = str.toLowerCase();        
        boolean[] visited = new boolean[26];
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            int index = str.charAt(i) - 'a';
            if (!visited[index]) {
                visited[index] = true;
                uniqueCount++;
            }
        }
        if (uniqueCount == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
