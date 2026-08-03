import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int l = 0;
        while (l < n-1 && a[l] <= a[l+1]){
            l++;
        }
        if  (l == n-1){
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }
        int r = l;
        while (r < n-1 && a[r] >= a[r+1]){
            r++;
        }
        reverse(a,l,r);
        if (isSorted(a)){
            System.out.println("yes");
            System.out.println((l + 1) + " " + (r + 1));
        }else{
            System.out.println("no");
        }
    }
    private static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    private static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
