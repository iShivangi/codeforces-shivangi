import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < username.length(); i++) {
            int index = username.charAt(i) - 'a'; 
            visited[index] = true;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 26; i++) {
            if (visited[i]) {
                uniqueCount++;
            }
        }
        if (uniqueCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
