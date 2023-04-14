import java.util.*;
import static java.lang.System.out;


public class ArraysSort {
    public static void main(String args[]) {
        int a[] = new int[]{
            10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        };

        // Never sort array using this its broken; TC:O(n^2)
        Arrays.sort(a);

        // Use this custom sort method which using Collections.sort(); TC:O(nlogn)
        // sort(a);

        out.println(Arrays.toString(a));
    }


    static void sort(int a[]) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int x : a)
            l.add(x);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }
    }

}
