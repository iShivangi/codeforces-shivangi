import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solvect = 0;
        for (int i = 0; i < n; i++){
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();
            if (petya + vasya + tonya >=2){
                solvect++;
            }
        }
        System.out.println(solvect);
    }
}
