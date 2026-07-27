import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int n = sc.nextInt();
        HashMap<String, Integer> database = new HashMap<>();    
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (!database.containsKey(name)) {
                System.out.println("OK");
                database.put(name, 1);
            } else {
                int count = database.get(name);
                System.out.println(name + count);
                database.put(name, count + 1);
            }
        }
    }
}
