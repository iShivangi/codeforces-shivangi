import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long tileslen = (n + a - 1)/a;
        long tileswid = (m + a - 1)/a;
        long total = tileslen * tileswid;
        System.out.println(total);
    }
}
