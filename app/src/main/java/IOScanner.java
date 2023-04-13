import java.util.*;


public class IOScanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = sc.next();
        System.out.println(x + " " + s);
        int a[] = new int[x];
        for(int i = 0 ; i < x ; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(
                Arrays.toString(a)
                .replace("[", "")
                .replace("]", "")
                .replace(",", " ")
                );
        sc.close();
    }
}
