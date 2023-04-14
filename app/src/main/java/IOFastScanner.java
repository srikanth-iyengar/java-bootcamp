import java.io.*;
import java.util.*;
public class IOFastScanner {

    public static void m1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        PrintWriter pw = new PrintWriter(System.out);
        int x = Integer.parseInt(br.readLine());
        int a[] = new int[x];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < x ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        String b[] = new String[x];
        for(int i = 0 ; i < x ; i++) {
            b[i] = st.nextToken();
        }
        pw.println(Arrays.toString(a));
        pw.println(Arrays.toString(b));
        pw.close();
    }

    public static void m2() {
        PrintWriter pw = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        int x = fs.nextInt();
        int a[] = new int[x];
        for(int i = 0 ; i < x ; i++) a[i] = fs.nextInt();
        String b[] = new String[x];
        for(int i = 0 ; i < x ; i++) b[i] = fs.next();
        pw.println(Arrays.toString(a));
        pw.println(Arrays.toString(b));
        pw.close();
    }

    public static void  main(String args[]) throws Exception {
        // m1();
        // m2();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] readArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[][] read2Array(int n, int m) {
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
    }
}
