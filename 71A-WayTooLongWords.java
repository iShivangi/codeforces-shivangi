import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String word = sc.next();
            int len = word.length();
            if (len>10){
                char first = word.charAt(0);
                char last = word.charAt(len -1);
                int mid = len -2;
                System.out.println("" + first + mid + last);
            }else{
                System.out.println(word);
            }
        }
    }
}
