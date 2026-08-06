import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            long low = 1;
            long high = 2000000000L; 
            long ans = 1;

            while (low <= high) {
                long mid = low + (high - low) / 2;

                long water = 0;
                for (int i = 0; i < n; i++) {
                    if (mid > a[i]) {
                        water += (mid - a[i]);
                    }
                    if (water > x) break;
                }

                if (water <= x) {
                    ans = mid;     
                    low = mid + 1;
                } else {
                    high = mid - 1; 
                }
            }

            System.out.println(ans);
        }
    }
}
